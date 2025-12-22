package com.test.service;

import java.util.List;
import java.util.ArrayList;

/**
 * Service class - Missing tests, should be detected
 */
public class UserService {
    
    public User findUserById(Long id) {
        // Missing null check, missing test
        return new User();
    }
    
    public List<User> getAllUsers() {
        // Missing test
        return new ArrayList<>();
    }
    
    public User createUser(String name, String email) {
        // Missing validation, missing test
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return user;
    }
    
    public void deleteUser(Long id) {
        // Critical method with no test
        // Should be flagged as high priority
    }
}

class User {
    private Long id;
    private String name;
    private String email;
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}


