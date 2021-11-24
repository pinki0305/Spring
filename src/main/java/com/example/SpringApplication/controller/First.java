package com.example.SpringApplication.controller;

import com.example.SpringApplication.dto.UserRequest;
import com.example.SpringApplication.entity.User;
import com.example.SpringApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class First
{
    @Autowired
    UserService userService;
    @GetMapping("/hello")
    public String hello()
    {
        return "hello from abc";
    }
    @PostMapping("/saveuser")

    public User saveUser(@RequestBody UserRequest userRequest)
    {

        User user1 = userService.saveUser(userRequest);
        user1.setLoginTime(new Date());
        return user1;

    }
    @GetMapping("/getuserdetails")
    public List<Object> getUserDetails()
    {
        List<Object> list = userService.getAllUser();
        return list;
    }


}
