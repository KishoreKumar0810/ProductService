package com.scaler.productservice.services;

import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public interface ProductService {
    public Product getProductById(Long productId);
    public List<Product>  getAllProducts();
}
