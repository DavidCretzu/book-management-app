package com.example.demo.service;

import com.example.demo.convertor.UserMapper;
import com.example.demo.dto.UserDto;
import com.example.demo.exception.NoMatchBookId;
import com.example.demo.model.User;
import com.example.demo.repository.BookRepository;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserServiceInerface{

    private final UserRepository userRepository;
    private final BookRepository bookRepository;

    @Override
    public void create(UserDto userDto) {
        User user = UserMapper.toEntity(userDto);
        userRepository.save(user);
    }

    @Override
    public void update(UserDto userDto, int id) {
    }

    @Override
    public List<UserDto> getAll() {
        List<User> users = userRepository.findAll();

        //from List<User> to List<UserDto>
        return users.stream()
                .map(user -> UserMapper.toDto(user))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteUser(int id) {
       if(!userRepository.existsById(id)){
           throw new NoMatchBookId("Cannot delete. User with id: " + id + " does not exist !");
       }
       userRepository.deleteById(id);
    }
}
