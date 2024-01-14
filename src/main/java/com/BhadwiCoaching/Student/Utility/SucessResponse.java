package com.BhadwiCoaching.Student.Utility;

import org.springframework.http.HttpStatus;

public class SucessResponse extends Response {
    private Object data;

    public SucessResponse( String message){
        super("success",HttpStatus.OK.value(), message);
    }

    public SucessResponse(String message, Object data){
        super("success",HttpStatus.OK.value(), message);
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
