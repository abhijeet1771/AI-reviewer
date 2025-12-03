package com.test.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

/**
 * REST Controller - Should trigger API design review
 * Missing versioning, missing @Valid, etc.
 */
@RestController
@RequestMapping("/api/users")  // Missing versioning
public class UserController {
    
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {  // Should return ResponseEntity
        return new User();
    }
    
    @PostMapping
    public User createUser(@RequestBody User user) {  // Missing @Valid
        return user;
    }
    
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {  // Missing @Valid
        return user;
    }
    
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {  // Should return ResponseEntity
        // Delete logic
    }
}

class User {
    private Long id;
    private String name;
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}


