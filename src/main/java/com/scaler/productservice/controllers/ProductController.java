package com.scaler.productservice.controllers;

import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}") // http://localhost:8080/products/
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @GetMapping //http://localhost:8080/products/
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }

    @PostMapping //http://localhost:8080/products/product
    public Product createProduct(@RequestBody Product product){
        return null;
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return null;
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long productId, @RequestBody Product product){
        return null;
    }

    @DeleteMapping
    public void deleteProduct(@PathVariable("id") Long productId){
    }
}
