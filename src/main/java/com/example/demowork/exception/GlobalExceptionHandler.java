package com.example.demowork.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserAlreadyExistExceptions.class)
    public ResponseEntity<ErrorDetails> handleUserAlreadyExistException(UserAlreadyExistExceptions ex){

        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setErrorMesssage(ex.getMessage());
        errorDetails.setErrorTime(LocalDate.now());


        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleGlobalException(Exception ex){
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setErrorMesssage(ex.getMessage());
        errorDetails.setErrorTime(LocalDate.now());
        return  new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);

    }
}
