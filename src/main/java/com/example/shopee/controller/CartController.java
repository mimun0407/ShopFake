package com.example.shopee.controller;

import com.example.shopee.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cart")
public class CartController {
    @Autowired
    CartService cartService;
    @GetMapping("/getCartById/{id}")
    public ResponseEntity getCartById(@PathVariable int id) {
        return new ResponseEntity<>(cartService.getCartDetails(id), HttpStatus.OK);
    }
}
