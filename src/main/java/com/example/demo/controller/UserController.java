package com.example.demo.controller;


import com.example.demo.dto.BookDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserServiceInerface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    @Autowired
    private final UserServiceInerface userServiceInerface;

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id){
        userServiceInerface.deleteUser(id);
    }

    @PostMapping("/create")
    public void createUser(@RequestBody UserDto userDto){
        userServiceInerface.create(userDto);
    }

    @GetMapping("/all")
    public List<UserDto> getAll(){
        return userServiceInerface.getAll();
    }
}
