package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity /// hibernate knows its an entity
@Data /// adds set , get and constructor
public class Book {
    @Id /// primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) ///  make it a primary key
    @Column(name = "book_id") /// hybernate
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "published_date")
    private LocalDate publishedDate;

    @Column(name = "pages")
    private int numberOfPages;
}
