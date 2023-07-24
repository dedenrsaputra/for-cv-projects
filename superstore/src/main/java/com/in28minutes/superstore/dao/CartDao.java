package com.in28minutes.superstore.dao;

import com.in28minutes.superstore.dao.param.QueryGetCartByUserId;
import com.in28minutes.superstore.dao.param.QueryGetUserByName;
import com.in28minutes.superstore.dao.param.QueryInsertUser;
import com.in28minutes.superstore.dto.CartDto;
import com.in28minutes.superstore.dto.req.ReqByName;

import java.util.List;

public interface CartDao {
    List<CartDto> getAllCart(QueryGetCartByUserId param);
}
