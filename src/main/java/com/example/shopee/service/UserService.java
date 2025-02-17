package com.example.shopee.service;

import com.example.shopee.Model.User;
import com.example.shopee.repository.UserRepository;
import com.example.shopee.dto.LoginRequest;
import com.example.shopee.dto.RegisterRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String registerUser(RegisterRequest request) {
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "Email already exists!";
        }
        userRepository.registerUser(request.getEmail(), request.getPassword(), request.getName());
        return "User registered successfully!";
    }

    public String loginUser(@RequestBody LoginRequest request, HttpSession session) {
        Optional<User> user = userRepository.findByEmail(request.getEmail());
        if (!user.isPresent()) {
            return "Wrong username or password!";
        }
        session.setAttribute("USER", user.get().getEmail());
        return "Login successful!";
    }
}
