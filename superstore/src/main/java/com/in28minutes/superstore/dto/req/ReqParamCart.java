package com.in28minutes.superstore.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class ReqParamCart {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ReqAddToCart{
        private long userId;
        private long productId;
    }
}
