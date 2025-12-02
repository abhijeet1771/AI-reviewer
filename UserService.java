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
}

