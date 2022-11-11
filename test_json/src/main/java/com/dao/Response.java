package com.dao;

import lombok.Data;

@Data
public class Response {
    private String msg;
    private Integer code;
    private Object data;
}
