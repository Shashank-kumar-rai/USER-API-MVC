package com.example.userapimvc.service;

import com.example.userapimvc.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    User updateUser(int id, User user);

    void deleteUser(int id);
}
