package com.example.shopee.Model;

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
