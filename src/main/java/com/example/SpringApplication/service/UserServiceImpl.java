package com.example.SpringApplication.service;

import com.example.SpringApplication.dto.UserRequest;
import com.example.SpringApplication.entity.User;
import com.example.SpringApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(UserRequest userRequest)
    {
        User user=new User();
        user.setUsername(userRequest.getUsername());
        user.setUserpassword(userRequest.getUserpassword());
        user.setLoginTime(userRequest.getLoginTime());
        User u= userRepository.save(user);
        return u;
    }

   @Override
    public List<Object> getAllUser() {
        List<Object> list = userRepository.findUserByNameList();
        return list;
    }
}
