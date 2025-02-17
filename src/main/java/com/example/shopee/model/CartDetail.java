package com.example.shopee.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CartDetail {
    Long id;
    Long cartId;
    Long productId;
    int quantity;
    LocalDateTime createdAt;

    public CartDetail(long id, long cartId, long productId, int quantity, LocalDateTime createdAt) {
        this.id = id;
        this.cartId = cartId;
        this.productId = productId;
        this.quantity = quantity;
        this.createdAt = createdAt;
    }
}
