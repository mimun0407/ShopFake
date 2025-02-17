package com.example.shopee.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Order {
    Long id;
    Long userId;
    Long cartId;
    int totalPrice;
    String status;
    LocalDateTime createdAt;
}
