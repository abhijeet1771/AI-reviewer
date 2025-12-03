import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<String> users = new ArrayList<>();
    
    // Security issue: No input validation
    public void addUser(String username) {
        users.add(username);
    }
    
    // Logic issue: Returns null without checking
    public String getUser(int index) {
        return users.get(index);
    }
    
    // Performance issue: Inefficient search
    public boolean userExists(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equals(username)) {
                return true;
            }
        }
        return false;
    }
    
    // Dead code: Unused method
    private void unusedMethod() {
        System.out.println("This is never called");
    }
    
    // New method with bugs
    public void deleteUser(int index) {
        // No bounds check - AI should catch
        users.remove(index);
    }
    
    public void updateUser(int index, String newName) {
        // No validation - AI should catch
        users.set(index, newName);
    }
    
    public int getUserCount() {
        // Inefficient - AI should suggest optimization
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            count++;
        }
        return count;
    }
}

