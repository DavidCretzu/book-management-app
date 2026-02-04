package com.example.demo.controller;

import com.example.demo.dto.BookDto;
import com.example.demo.model.Book;
import com.example.demo.service.BookServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    @Autowired
    private final BookServiceInterface bookServiceInterface;

    @PostMapping("/create")
    public void createBook(@RequestBody BookDto bookDto){
        bookServiceInterface.createBook(bookDto);
    }

    @DeleteMapping("/delete")
    public void deleteBook(@RequestParam String title , @RequestParam String author){
        bookServiceInterface.deleteBookByAuthorTitle(title , author);
    }

    @GetMapping("/test-cors")
    public String testConnection() {
        return "CORS is working! Hello from Spring Boot.";
    }

}
