package com.scaler.productservice.models;


import com.scaler.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Product extends BaseModel{
    private String name;
    private double price;
    private String description;
    private String imageUrl;
    private Category  category;
}
