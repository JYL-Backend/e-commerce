package com.example.userservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
    private String emial;
    private String name;
    private String pwd;
    private String userId;
    private Date createdAt;

    private String encrypedPwd;
}
