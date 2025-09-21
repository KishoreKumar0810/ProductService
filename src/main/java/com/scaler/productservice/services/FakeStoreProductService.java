package com.scaler.productservice.services;

import com.scaler.productservice.dtos.FakeStoreProductDto;
import com.scaler.productservice.models.Category;
import com.scaler.productservice.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private Product convertToProduct(FakeStoreProductDto fakeStoreProductDto) {
        Product product = new Product();
        product.setName(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImageUrl(fakeStoreProductDto.getImageUrl());
        Category category = new Category();
        category.setName(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        return product;
    }
    @Override
    public Product getProductById(Long productId) {
        // Make an API call to fakestore and get the product with given id
        FakeStoreProductDto productDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+productId, FakeStoreProductDto.class
        );

        return convertToProduct(productDto);
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDto[] productDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/", FakeStoreProductDto[].class
        );
        List<Product> productList = new ArrayList<>();
        for (FakeStoreProductDto product : productDto) {
            productList.add(convertToProduct(product));
        }
        return productList;
    }
}
