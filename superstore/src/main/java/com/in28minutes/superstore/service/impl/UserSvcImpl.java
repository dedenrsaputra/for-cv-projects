package com.in28minutes.superstore.service.impl;


import com.in28minutes.superstore.dto.UserDto;
import com.in28minutes.superstore.dto.req.ReqByName;
import com.in28minutes.superstore.dto.req.ReqInsertUser;
import com.in28minutes.superstore.repository.UserRepo;

import com.in28minutes.superstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSvcImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public List<UserDto> getAllUser(ReqByName param) {

        return userRepo.getUserByName(param);
    }

    @Override
    public  List<UserDto>  insertUser(ReqInsertUser param) {
        return userRepo.addUser(param);
    }
}
