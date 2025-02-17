package com.example.shopee.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class User {
    Long id;
    String name;
    String email;
    String password;
    String phone;
    String address;
    LocalDateTime createdAt;
}
