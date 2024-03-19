package com.dani.users.exceptions;

public class UserIdNotFoundException extends RuntimeException {
    public UserIdNotFoundException() {
        super("User Id not found");
    }

}
