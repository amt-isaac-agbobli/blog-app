package com.example.blogapp.models;

import java.util.UUID;

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

    public User() {
    }

    public User(UUID id, String firstName, String lastName, String email, String password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
