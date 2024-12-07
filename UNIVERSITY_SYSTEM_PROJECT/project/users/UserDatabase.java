package users;

import java.util.HashMap;

public class UserDatabase {
    private static UserDatabase instance; 
    private final HashMap<String, String> users = new HashMap<>();

    private UserDatabase() {
        users.put("admin", "admin123");
    }

    public static synchronized UserDatabase getInstance() {
        if (instance == null) {
            instance = new UserDatabase();
        }
        return instance;
    }

    public HashMap<String, String> getDatabase() {
        return users;
    }
    public void addUser(String login, String password) {
        users.put(login, password);
    }
}

