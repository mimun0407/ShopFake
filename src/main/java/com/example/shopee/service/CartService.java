package com.example.shopee.service;

import com.example.shopee.model.CartDetail;
import com.example.shopee.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public List<CartDetail> getCartDetails(long id) {
        return cartRepository.getAllCartDetailByCartId(id);
    }
}
