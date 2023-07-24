package com.in28minutes.superstore.dao;


import com.in28minutes.superstore.dao.param.QueryInsertUser;
import com.in28minutes.superstore.dto.UserDto;
import com.in28minutes.superstore.dto.req.ReqByName;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<UserDto> getUserByName(ReqByName param);

   int insertUser(@Param("in") QueryInsertUser param,@Param("out") QueryInsertUser.outParam pOut);



}
