package com.example.demowork.exception;

public class UserAlreadyExistExceptions extends RuntimeException{
    public UserAlreadyExistExceptions(String message){
        super(message);
    }
}
