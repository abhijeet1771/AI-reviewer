package com.test;

/**
 * Simple test service for Droog AI review
 */
public class TestService {
    
    // This method is duplicate - same as in main branch
    public String getUserName(int userId) {
        return "User" + userId;
    }
    
    // Duplicate method - same logic as above
    public String getUserNameDuplicate(int userId) {
        return "User" + userId;
    }
    
    // Method to check against main branch
    public void processData(String data) {
        // Simple method for testing
        System.out.println("Processing: " + data);
    }
}

