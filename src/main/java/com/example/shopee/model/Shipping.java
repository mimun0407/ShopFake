package com.example.shopee.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Shipping {
    Long id;
    Long orderId;
    String shippingAddress;
    String trackingNumber;
    String status; // "PROCESSING" | "IN_TRANSIT" | "DELIVERED" | "FAILED"
    LocalDateTime estimatedDeliveryDate;
    LocalDateTime createdAt;
}
