package com.ahs.urbanliving.dto;


import com.ahs.urbanliving.domain.Role;
import com.ahs.urbanliving.domain.User;

import java.util.Set;

public class UserResponse {

    private Long id;
    private String fullName;
    private String email;
    private Set<Role> roles;

    public UserResponse(Long id, String fullName, String email, Set<Role> roles) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.roles = roles;
    }

    // Factory method - converts User entity to UserResponse DTO
    public static UserResponse from(User user) {
        return new UserResponse(
                user.getId(),
                user.getFullName(),
                user.getEmail(),
                user.getRoles()
        );
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public Set<Role> getRoles() {
        return roles;
    }
}