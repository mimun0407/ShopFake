package com.example.shopee.Model;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Cart {
    Long id;
    Long userId;
    String status; // "ACTIVE" | "CHECKED_OUT"
    LocalDateTime createdAt;
}
