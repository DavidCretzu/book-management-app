package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import com.example.demo.service.BookServiceInterface;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController/// to handle http methods , to return java objects as json/xml automated(Controller + ResponseBody)
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    @Autowired
    private final BookServiceInterface bookServiceInterface;

    @PostMapping("/create")///  when a http POST request is received at /books URL createBook method will be used
    public void createBook(@RequestBody BookDto bookDto){bookServiceInterface.createBook(bookDto);///RequestBody to read the data
    }
}
