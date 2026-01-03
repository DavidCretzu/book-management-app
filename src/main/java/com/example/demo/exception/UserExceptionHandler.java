package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class UserExceptionHandler {
    @ExceptionHandler(NoMatchUserId.class)
    public ResponseEntity<Map<String , Object>> handleNoMatchUserId(NoMatchUserId exception){
        Map<String , Object> body = new LinkedHashMap<>();
        body.put("timestamp" , LocalDateTime.now());
        body.put("message" , exception.getMessage());
        body.put("status" , HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<>(body , HttpStatus.NOT_FOUND);
    }
}
