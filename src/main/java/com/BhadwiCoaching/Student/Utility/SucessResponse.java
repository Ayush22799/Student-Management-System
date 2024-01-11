package com.BhadwiCoaching.Student.Utility;

import org.springframework.http.HttpStatus;

public class SucessResponse extends Response {
    private Object data;

    public SucessResponse(HttpStatus httpStatus, String message){
        super("success", message);
        this.setStatusCode(httpStatus.value());
    }

    public SucessResponse(HttpStatus httpStatus, String message, Object data){
        super("success", message);
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
