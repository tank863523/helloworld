package com.kangyong.test04.controller;

import com.kangyong.test04.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getUser")
    String getUserName(String username,String pwd){

        return username;
    }
    @PostMapping("/postUser")
    String sendUserName(User user){
        return "post";
    }
}
