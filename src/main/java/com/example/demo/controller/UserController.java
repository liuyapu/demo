package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test1")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    public User GetUser(@RequestParam("userId") String userId){
        System.out.println(userId);
        User user = userService.getUserById(userId);
        if(user == null){
            System.out.println("没取到");
        }
        //System.out.println(user.toString());
        return user;
    }
}
