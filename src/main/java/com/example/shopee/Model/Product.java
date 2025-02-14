package com.example.shopee.Model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Product {
    Long id;
    String name;
    String description;
    int price;
    int stockQuantity;
    LocalDateTime createdAt;
}
