package com.stackroute;

public class User {
    private String message;

    @Override
    public String toString() {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }



    public User(String message) {
        this.message = message;
    }
}
