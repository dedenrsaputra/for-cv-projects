package com.in28minutes.superstore.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReqByName {
    private String name;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ReqByUserId{
        private long id;
    }
}
