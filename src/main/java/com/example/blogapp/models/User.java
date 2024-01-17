package com.example.blogapp.models;

import com.example.blogapp.enums.RoleType;

import java.util.UUID;

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private RoleType role;

    public User() {
    }

    public User(UUID id, String firstName, String lastName, String email, String password, RoleType role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
