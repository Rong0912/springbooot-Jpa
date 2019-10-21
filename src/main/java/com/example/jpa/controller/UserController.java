package com.example.jpa.controller;

import com.example.jpa.bean.User;
import com.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author EDZ
 * @date 2019/10/16
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public List<User> findAll(){

        return userService.findAll();
    }

    @GetMapping("/deleteAll")
    public List<User> deleteAllInBath(){
        userService.deleteAllInBatch();
        return userService.findAll();
    }
    @ResponseBody
    @GetMapping("/delete/{userId}")
    public List<User> deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
        return userService.findAll();
    }

}
