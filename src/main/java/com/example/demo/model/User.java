package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id///  makes it a primarykey
    @GeneratedValue(strategy = GenerationType.IDENTITY) /// auto-generates id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

}
