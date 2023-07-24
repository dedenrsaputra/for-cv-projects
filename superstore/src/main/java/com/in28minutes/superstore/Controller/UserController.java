package com.in28minutes.superstore.Controller;

import com.in28minutes.superstore.dto.SuccessResponse;
import com.in28minutes.superstore.dto.UserDto;
import com.in28minutes.superstore.dto.req.ReqByName;

import com.in28minutes.superstore.dto.req.ReqInsertUser;
import com.in28minutes.superstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsersByName")
    public ResponseEntity<SuccessResponse<List<UserDto>>> getAllUsers(@RequestParam ReqByName param){
        return ResponseEntity.ok(new SuccessResponse<>("Success",userService.getAllUser(param)));
    }

    @PostMapping("/addUser")
    public ResponseEntity<SuccessResponse<List<UserDto>>> addUser(@RequestBody ReqInsertUser param){
        return ResponseEntity.ok(new SuccessResponse<>("Success",userService.insertUser(param)));
    }

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "hello world";
    }
}
