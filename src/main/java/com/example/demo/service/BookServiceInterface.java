package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.model.Book;

import java.util.List;

public interface BookServiceInterface {
    public void createBook(BookDto bookDto);
    public void updateBook(BookDto bookDto , int id);
    public void deleteBookById(int id);
    public List<BookDto> getAllBooks();
    void deleteBookByAuthorTitle(String title, String author);
}
