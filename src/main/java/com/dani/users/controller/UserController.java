package com.dani.users.controller;

import com.dani.users.domain.User;
import com.dani.users.requests.CreateUserRequest;
import com.dani.users.requests.UpdateUserRequest;
import com.dani.users.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    UserService userService;
    public UserController(UserService userService) { this.userService = userService; }

    @PostMapping("/useri")
    User createUser(@RequestBody CreateUserRequest request) {
        return userService.createUser(request);
    }

    @GetMapping("/useri/{id}")
    User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PutMapping("/useri/{id}")
    User updateUser(@RequestBody UpdateUserRequest request, @PathVariable String id) {
        return userService.updateUser(id,request);
    }
    @GetMapping("/useri")
    List<User> getUseri() {
        return userService.getUsers();
    }
}
