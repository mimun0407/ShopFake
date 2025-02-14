package com.example.shopee.Model;

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
