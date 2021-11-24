package com.example.SpringApplication.service;

import com.example.SpringApplication.dto.UserRequest;
import com.example.SpringApplication.entity.User;

import java.util.List;

public interface UserService
{
    public User saveUser(UserRequest userRequest);

    public List<Object> getAllUser();

}
