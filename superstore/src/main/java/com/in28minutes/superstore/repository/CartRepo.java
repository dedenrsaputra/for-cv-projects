package com.in28minutes.superstore.repository;

import com.in28minutes.superstore.dto.CartDto;
import com.in28minutes.superstore.dto.UserDto;

import java.util.List;

public interface CartRepo {
    List<CartDto> getAllCart(long id);
}
