package com.example.shopee.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Payment {
    Long id;
    Long orderId;
    String paymentMethod; // "CASH" | "CREDIT_CARD" | "PAYPAL"
    String paymentStatus; // "PENDING" | "COMPLETED" | "FAILED"
    String transactionId; // Có thể null nếu thanh toán bằng tiền mặt
    LocalDateTime createdAt;
}
