package com.in28minutes.superstore.Controller;

import com.in28minutes.superstore.dto.CartDto;
import com.in28minutes.superstore.dto.SuccessResponse;
import com.in28minutes.superstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/getAllCart/{id}")
    public ResponseEntity<SuccessResponse<List<CartDto>>> getAllCart(@PathVariable long id){
        return ResponseEntity.ok(new SuccessResponse<>("Success",cartService.getAllCart(id)));

    }

}
