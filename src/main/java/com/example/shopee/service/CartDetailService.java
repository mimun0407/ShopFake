package com.example.shopee.service;

import com.example.shopee.model.CartDetail;
import com.example.shopee.repository.CartDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDetailService {
    @Autowired
    CartDetailRepository cartDetailRepository;

    public List<CartDetail> getCartDetails() {
       return cartDetailRepository.getCartDetail();
    }
}
