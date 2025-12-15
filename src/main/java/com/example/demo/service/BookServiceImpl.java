package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor ///all type of constructor for the class
public class BookServiceImpl implements BookServiceInterface{

    private final BookRepository bookRepository;


    @Override
    public void createBook(BookDto bookDto) {
        Book book = new Book();

        book.setAuthor(bookDto.getAuthor());
        book.setNumber(bookDto.getNumber());
        book.setPublishedDate(bookDto.getPublishedDate());
        book.setNumberOfPages(bookDto.getNumberOfPages());

        bookRepository.save(book);
    }
}
