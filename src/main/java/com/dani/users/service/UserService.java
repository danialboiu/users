package com.dani.users.service;

import com.dani.users.domain.Adresa;
import com.dani.users.domain.User;
import com.dani.users.requests.CreateUserRequest;
import com.dani.users.requests.UpdateUserRequest;

import java.util.List;

public interface UserService {
    User createUser(CreateUserRequest request);
    User getUserById(String id);
    User updateUser(String id, UpdateUserRequest updateRequest);
    List<User> getUsers();
}
