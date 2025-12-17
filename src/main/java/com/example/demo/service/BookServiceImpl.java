package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor ///all class fields constructor
public class BookServiceImpl implements BookServiceInterface{

    private final BookRepository bookRepository;


    @Override
    public void createBook(BookDto bookDto) {
        Book book = new Book();

        book.setAuthor(bookDto.getAuthor());
        book.setTitle(bookDto.getTitle());
        book.setNumberOfPages(bookDto.getNumberOfPages());
        book.setPublishedDate(bookDto.getPublishedDate());

        bookRepository.save(book);
    }
}
