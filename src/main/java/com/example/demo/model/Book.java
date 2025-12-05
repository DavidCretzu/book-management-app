package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity /// jba knows its an entity
@Data /// adds set and get and constructor
public class Book {
    @Id /// primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id") /// hybernate
    private int id;

    @Column(name = "title")
    private String title;
}
