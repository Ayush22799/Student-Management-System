package com.BhadwiCoaching.Student.Exception;

import com.BhadwiCoaching.Student.Utility.Response;
import org.springframework.http.HttpStatus;

public class DetailsNotFoundException extends RuntimeException{

    private int statusCode;
    public DetailsNotFoundException(Response response){
    }

}
