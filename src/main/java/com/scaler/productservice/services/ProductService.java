package com.scaler.productservice.services;

import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public interface ProductService {
    public Product getProductById(Long productId);
}
