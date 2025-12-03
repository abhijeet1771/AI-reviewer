package com.test.patterns;

/**
 * Factory Pattern Example - Should be detected
 */
public class UserFactory {
    
    public User createAdminUser() {
        return new AdminUser();
    }
    
    public User createRegularUser() {
        return new RegularUser();
    }
    
    public User createGuestUser() {
        return new GuestUser();
    }
}

interface User {
    String getRole();
}

class AdminUser implements User {
    public String getRole() {
        return "ADMIN";
    }
}

class RegularUser implements User {
    public String getRole() {
        return "USER";
    }
}

class GuestUser implements User {
    public String getRole() {
        return "GUEST";
    }
}

