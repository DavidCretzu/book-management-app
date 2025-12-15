package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import com.example.demo.service.BookServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    @Autowired
    private final BookServiceInterface bookServiceInterface;

    @PostMapping("/create")
    public void createBook(BookDto bookDto){
        bookServiceInterface.createBook(bookDto);
    }
}
