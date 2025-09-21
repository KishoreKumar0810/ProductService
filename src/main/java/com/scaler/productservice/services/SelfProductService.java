package com.scaler.productservice.services;

import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("selfProductService")
public class SelfProductService implements ProductService{
    @Override
    public Product getProductById(Long productId) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
