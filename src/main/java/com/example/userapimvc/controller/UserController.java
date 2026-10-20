package com.example.userapimvc.controller;

import com.example.userapimvc.entity.User;
import com.example.userapimvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
   private UserService userService;


    // CREATE
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Get ALL USERS
    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // GetUSER by ID
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    // UPDATE USER
    @PutMapping("/user/{id}")
    public User updateUser(
            @PathVariable int id,
            @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    // DELETE  USER
    @DeleteMapping ("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
