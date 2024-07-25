package com.miniproject.miniproject.service;

import com.miniproject.miniproject.dto.UserDto;
import com.miniproject.miniproject.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}