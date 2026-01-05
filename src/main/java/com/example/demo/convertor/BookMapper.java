package com.example.demo.convertor;

import com.example.demo.dto.BookDto;
import com.example.demo.model.Book;

public class BookMapper {
    public static Book toEntity(BookDto bookDto){
        return Book.builder()
                .title(bookDto.getTitle())
                .author(bookDto.getAuthor())
                .publishedDate(bookDto.getPublishedDate())
                .numberOfPages(bookDto.getNumberOfPages())
                .build();
    }

    public static BookDto toDto(Book book){
        return BookDto.builder()
                .title(book.getTitle())
                .author(book.getAuthor())
                .publishedDate(book.getPublishedDate())
                .numberOfPages(book.getNumberOfPages())
                .build();
    }
}
