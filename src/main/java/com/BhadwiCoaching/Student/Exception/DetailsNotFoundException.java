package com.BhadwiCoaching.Student.Exception;

import com.BhadwiCoaching.Student.Utility.Response;
import org.springframework.http.HttpStatus;

public class DetailsNotFoundException extends RuntimeException{

    private String message;

    public DetailsNotFoundException(String message){
    super(message);
    this.message=message;
    }
}
