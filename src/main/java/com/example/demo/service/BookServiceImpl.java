package com.example.demo.service;

import com.example.demo.dto.BookDto;
import com.example.demo.exception.NoMatchBookId;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor ///all type of constructor for the class
public class BookServiceImpl implements BookServiceInterface{

    private final BookRepository bookRepository;


    @Override
    public void createBook(BookDto bookDto) {
        Book book = new Book();

        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setPublishedDate(bookDto.getPublishedDate());
        book.setNumberOfPages(bookDto.getNumberOfPages());

        bookRepository.save(book);
    }

    @Override
    public void updateBook(BookDto bookDto , int id){
    }

    @Override
    public void deleteBookById(int id) {
        if(!bookRepository.existsById(id))
            throw new NoMatchBookId("Cannot Delete. Book with id: " + id + " does not exist !");
        bookRepository.deleteById(id);
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();

        //from List<Book> to List<BookDto>
        return books.stream()
                .map(book -> new BookDto(book.getTitle() , book.getAuthor() , book.getPublishedDate() , book.getNumberOfPages()))
                .collect(Collectors.toList());
    }


}
