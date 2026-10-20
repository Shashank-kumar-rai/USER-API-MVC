package com.example.userapimvc.service;
import com.example.userapimvc.entity.User;
import com.example.userapimvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
  @Autowired
  private UserRepository userRepository;



    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id)  .orElseThrow(() ->
                new RuntimeException("User not found: " + id));
    }

    @Override
    public User updateUser(int id, User user) {

        User userById = getUserById(id);
        userById.setName(user.getName());
        userById.setCity(user.getCity());
        userById.setPassword(user.getPassword());
        return this.userRepository.save(userById);
    }

    @Override
    public void deleteUser(int id) {
        User userById = getUserById(id);
        userRepository.delete(userById);
    }
}
