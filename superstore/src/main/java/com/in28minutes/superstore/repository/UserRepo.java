package com.in28minutes.superstore.repository;



import com.in28minutes.superstore.dto.UserDto;
import com.in28minutes.superstore.dto.req.ReqByName;
import com.in28minutes.superstore.dto.req.ReqInsertUser;

import java.util.List;



public interface UserRepo {

    List<UserDto> getUserByName(ReqByName param);

    List<UserDto>  addUser(ReqInsertUser param);
}
