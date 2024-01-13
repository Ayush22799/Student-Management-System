package com.BhadwiCoaching.Student.Utility;

import org.springframework.http.HttpStatus;

public class SucessResponse extends Response {
    private Object data;

    public SucessResponse(HttpStatus httpStatus, String message){
        super("success",httpStatus.value(), message);
    }

    public SucessResponse(HttpStatus httpStatus, String message, Object data){
        super("success",httpStatus.value(), message);
        this.data = data;
        this.setStatusCode(httpStatus.value());
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
