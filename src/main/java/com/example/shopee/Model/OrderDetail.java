package com.example.shopee.Model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class OrderDetail {
    Long id;
    Long orderId;
    Long productId;
    int quantity;
    int price; // Giá tại thời điểm mua
    LocalDateTime createdAt;
}
