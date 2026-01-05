package com.example.demo.convertor;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;

public class UserMapper {
    public static User toEntity(UserDto userDto){
        return User.builder()
                .userName(userDto.getUserName())
                .password(userDto.getPassword())
                .build();
    }

    public static UserDto toDto(User user){
        return UserDto.builder()
                .userName(user.getUserName())
                .password(user.getPassword())
                .build();
    }
}
