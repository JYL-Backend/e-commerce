package com.example.userservice.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class RequestUserDto {
    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, message = "Name not be less than two characters")
    private String name;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, message = "Password must be equal or grater than 8 characters")
    private String pwd;

    static public UserDto getUserDto(RequestUserDto requestUserDto){
        return UserDto.builder()
                .email(requestUserDto.getEmail())
                .name(requestUserDto.getName())
                .userId(UUID.randomUUID().toString())
                .pwd(requestUserDto.getPwd())
                .encrypedPwd(requestUserDto.getPwd())
                .createdAt(new Date())
                .build();
    }
}
