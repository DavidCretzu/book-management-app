package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserServiceInerface{

    private final UserRepository userRepository;

    @Override
    public void create(UserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());

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
                .map(user -> new UserDto(user.getUserName() , user.getPassword()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
