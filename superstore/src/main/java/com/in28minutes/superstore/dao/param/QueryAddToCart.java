package com.in28minutes.superstore.dao.param;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryAddToCart {
    private long pUserId;
    private long pProductId;

    @Data
    public static class pOut{
        private String pOut;
    }
}
