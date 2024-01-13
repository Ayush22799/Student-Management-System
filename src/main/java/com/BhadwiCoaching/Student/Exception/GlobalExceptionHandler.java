package com.BhadwiCoaching.Student.Exception;

import com.BhadwiCoaching.Student.Utility.ErrorResponse;
import com.BhadwiCoaching.Student.Utility.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = DetailsNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody Response handleException(DetailsNotFoundException nf){
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(),nf.getMessage());
    }
}
