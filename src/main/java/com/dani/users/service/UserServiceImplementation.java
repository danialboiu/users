package com.dani.users.service;

import com.dani.users.domain.Adresa;
import com.dani.users.domain.User;
import com.dani.users.exceptions.UserIdNotFoundException;
import com.dani.users.requests.CreateUserRequest;
import com.dani.users.requests.UpdateUserRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class UserServiceImplementation implements UserService {
    List<User> users = new ArrayList<>();

    public User createUser(CreateUserRequest request) {
        String idUser = UUID.randomUUID().toString();
        User user = new User(idUser, request.getNume(),request.getAdresa(), request.getEmail(), request.getParola());
        users.add(user);
        return user;
    }
    @Override
    public User getUserById(String id) {
        var userCurent = users.stream().filter(user -> user.getId().equals(id)).findFirst();
        if(userCurent.isPresent()) {
            return userCurent.get();
        } else {
            throw new UserIdNotFoundException();
        }
    }

    @Override
    public User updateUser(String id, UpdateUserRequest updateRequest) {
        var userCurent = users.stream().filter(user -> user.getId().equals(id)).findFirst();
        if(userCurent.isPresent()) {
            User user = userCurent.get();
            if (updateRequest.getNume() != null) {
                user.setNume(updateRequest.getNume());
            }
            if (updateRequest.getAdresa() != null) {
                user.setAdresa(updateRequest.getAdresa());
            }
            if (updateRequest.getEmail() != null) {
                user.setEmail(updateRequest.getEmail());
            }
            if (updateRequest.getParola() != null) {
                user.setParola(updateRequest.getParola());
            }
            return user;
        } else {
            throw new UserIdNotFoundException();
        }
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

}
