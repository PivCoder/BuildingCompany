package com.example.buildingcompany.service.api;

import com.example.buildingcompany.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    void deleteUser(long id);
    User getUserById(long id);
    User editUser(User user);
    List<User> getAllUsers();
}
