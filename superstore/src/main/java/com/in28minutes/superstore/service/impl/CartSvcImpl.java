package com.in28minutes.superstore.service.impl;

import com.in28minutes.superstore.dto.CartDto;
import com.in28minutes.superstore.dto.UserDto;
import com.in28minutes.superstore.repository.CartRepo;
import com.in28minutes.superstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartSvcImpl implements CartService {
    @Autowired
    private CartRepo cartRepo;
    @Override
    public List<CartDto> getAllCart(long id) {
        return cartRepo.getAllCart(id);
    }
}
