package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;

import java.util.List;

public interface UserServiceInerface {
    public void create(UserDto userDto);
    public void update(UserDto userDto, int id);
    public List<UserDto> getAll();
    public void deleteUser(int id);
}
