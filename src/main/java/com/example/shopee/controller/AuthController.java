package com.example.shopee.controller;

import com.example.shopee.dto.LoginRequest;
import com.example.shopee.dto.RegisterRequest;
import com.example.shopee.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        String result = userService.registerUser(request);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest, HttpSession session) {
        String result = userService.loginUser(loginRequest, session);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/profile")
    public String getProfile(HttpSession session) {
        String userEmail = (String) session.getAttribute("USER");
        if (userEmail != null) {
            return "User not logged";
        }
        return "Logged in: " + userEmail;

    }
}
