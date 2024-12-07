package users;

public class Manager {
    private final UserDatabase database;

    public Manager() {
        this.database = UserDatabase.getInstance();
    }

    public boolean authenticate(String username, String password) {
        if (database.getDatabase().containsKey(username)) {
            if (database.getDatabase().get(username).equals(password)) {
                System.out.println("Аутентификация успешна.");
                return true;
            } else {
                System.out.println("Неверный пароль.");
            }
        } else {
            System.out.println("Пользователь не найден.");
        }
        return false;
    }
}

