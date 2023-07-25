package com.in28minutes.superstore.dao;

import com.in28minutes.superstore.dao.param.QueryAddToCart;
import com.in28minutes.superstore.dao.param.QueryGetCartByUserId;
import com.in28minutes.superstore.dao.param.QueryGetUserByName;
import com.in28minutes.superstore.dao.param.QueryInsertUser;
import com.in28minutes.superstore.dto.CartDto;
import com.in28minutes.superstore.dto.req.ReqByName;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartDao {
    List<CartDto> getAllCart(QueryGetCartByUserId param);
    int addProductToCart(@Param("in") QueryAddToCart in, @Param("out") QueryAddToCart.pOut out);

}
