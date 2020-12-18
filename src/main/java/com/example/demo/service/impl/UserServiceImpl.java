package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;


@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(String userId) {
        //System.out.println("111："+userMapper.selectUserById(userId).getUserId());
        System.out.println("iml层："+userId);
        return userMapper.selectUserById(userId);
    }
}
