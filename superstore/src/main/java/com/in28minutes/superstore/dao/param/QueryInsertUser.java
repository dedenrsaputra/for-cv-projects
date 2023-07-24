package com.in28minutes.superstore.dao.param;

import com.in28minutes.superstore.dto.req.ReqInsertUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QueryInsertUser {
    private String pName;
    private String pEmail;
    private String pPassword;

    @Data
    public static class outParam{
        private long pOut;
    }
    public static QueryInsertUser from(ReqInsertUser param){
        return new QueryInsertUser().builder()
                .pName(param.getName())
                .pEmail(param.getEmail())
                .pPassword(param.getPassword())
                .build();
    }



}
