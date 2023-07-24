package com.in28minutes.superstore.service;


import com.in28minutes.superstore.dto.UserDto;
import com.in28minutes.superstore.dto.req.ReqByName;
import com.in28minutes.superstore.dto.req.ReqInsertUser;

import java.util.List;


public interface UserService {

    List<UserDto> getAllUser(ReqByName param);

    List<UserDto>  insertUser(ReqInsertUser param);
}
