package com.BhadwiCoaching.Student.Utility;

import org.springframework.http.HttpStatus;

public class ErrorResponse extends Response{

    public ErrorResponse(String message){
    super("Failure", message);
    }
}
