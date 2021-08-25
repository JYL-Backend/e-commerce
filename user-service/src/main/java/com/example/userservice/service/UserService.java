package com.example.userservice.service;

import com.example.userservice.dto.RequestUserDto;
import com.example.userservice.dto.UserDto;
import org.springframework.stereotype.Service;

public interface UserService {
    UserDto createUser(RequestUserDto requestUserDto);
}
