package com.in28minutes.superstore.dao.param;

import com.in28minutes.superstore.dto.UserDto;
import com.in28minutes.superstore.dto.req.ReqByName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QueryGetUserByName {
    private String pName;
    private List<UserDto> pRefcur;

    public static QueryGetUserByName from(ReqByName param){
        return QueryGetUserByName.builder().pName(param.getName()).build();
    }




}
