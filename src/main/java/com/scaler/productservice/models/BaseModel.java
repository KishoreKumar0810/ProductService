package com.scaler.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass // No table will be created for this class but all the attributes of this class(parent) will be present to all the child class tables.
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    private Long  id;
    private Date createdAt;
    private Date updatedAt;
}
