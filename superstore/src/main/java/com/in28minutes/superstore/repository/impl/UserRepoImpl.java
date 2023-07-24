package com.in28minutes.superstore.repository.impl;


import com.in28minutes.superstore.dao.UserDao;
import com.in28minutes.superstore.dao.param.QueryInsertUser;
import com.in28minutes.superstore.dto.UserDto;
import com.in28minutes.superstore.dto.req.ReqByName;
import com.in28minutes.superstore.dto.req.ReqInsertUser;
import com.in28minutes.superstore.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo {

   @Autowired
    private UserDao userDao;

    public List<UserDto> getUserByName(ReqByName param) {
        return userDao.getUserByName(param);
    }

    @Override
    public List<UserDto> addUser(ReqInsertUser param) {
        QueryInsertUser in = QueryInsertUser.from(param);
        QueryInsertUser.outParam out = new QueryInsertUser.outParam();
        userDao.insertUser(in,out);
        UserDto userDto = new UserDto(out.getPOut(),in.getPName(),in.getPEmail(),in.getPPassword());
        List<UserDto> res = new ArrayList<>();
        res.add(userDto);
        return res;
    }
}
