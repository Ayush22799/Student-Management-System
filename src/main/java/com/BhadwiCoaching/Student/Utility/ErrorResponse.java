package com.BhadwiCoaching.Student.Utility;

import org.springframework.http.HttpStatus;

public class ErrorResponse extends Response{
public ErrorResponse(int statusCode, String message){
        super("Failure",statusCode, message);
    }
}
