package com.example.springboot_devops.controller;

import com.example.springboot_devops.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private List<User> users = new ArrayList<User>();

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    //add user
    @PostMapping
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
}
