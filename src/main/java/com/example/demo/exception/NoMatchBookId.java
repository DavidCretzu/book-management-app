package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoMatchBookId extends RuntimeException{
    private String message;

    public NoMatchBookId(){};
    public NoMatchBookId(String message){
        super(message);
        this.message = message;
    }
}
