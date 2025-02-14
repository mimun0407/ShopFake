package com.example.shopee.Model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CartDetail {
    Long id;
    Long cartId;
    Long productId;
    int quantity;
    LocalDateTime createdAt;
}
