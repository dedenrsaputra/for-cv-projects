package com.in28minutes.superstore.dto.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReqInsertUser {

    private String name;
    private String email;
    private String password;
}
