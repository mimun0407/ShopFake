package com.example.shopee.model;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Cart {
    Long id;
    Long userId;
    String status; // "ACTIVE" | "CHECKED_OUT"
    LocalDateTime createdAt;

    public Cart(long id, long aLong, String status, LocalDateTime createdAt) {
        this.id = id;
        this.userId = aLong;
        this.status = status;
        this.createdAt = createdAt;
    }
}
