package com.in28minutes.superstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {
    private long cartId;
    private long productId;
    private long userId;
    private int total;
}
