package com.example.userservice.service;

import com.example.userservice.dto.RequestUserDto;
import com.example.userservice.dto.UserDto;
import com.example.userservice.entity.UserEntity;
import com.example.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(RequestUserDto requestUserDto) {
        UserDto userDto = RequestUserDto.getUserDto(requestUserDto);

        UserEntity entity = UserEntity.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .userId(userDto.getUserId())
                .encryptedPwd(userDto.getPwd())
                .build();

        userRepository.save(entity);
        return null;
    }
}
