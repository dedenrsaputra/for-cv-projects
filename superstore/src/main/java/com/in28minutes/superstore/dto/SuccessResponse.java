package com.in28minutes.superstore.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SuccessResponse<T> {

    private String message;
    private LocalDateTime timeStamp;
    private T data;

    public SuccessResponse(String message, T data) {
        this.message = message;
        this.data = data;
        this.timeStamp = LocalDateTime.now();
    }

}
