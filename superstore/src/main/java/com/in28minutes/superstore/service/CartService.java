package com.in28minutes.superstore.service;

import com.in28minutes.superstore.dto.CartDto;

import java.util.List;

public interface CartService {

    List<CartDto> getAllCart(long id);
}
