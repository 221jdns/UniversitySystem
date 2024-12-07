package employee;

import users.User;
import users.UserDatabase;

public class Admin extends Employee {
    private final UserDatabase database;

    public Admin(String login, String password) {
        super(login, password);
        this.database = UserDatabase.getInstance();
    }

    public void addUser(String login, String password) {
        database.addUser(login, password);
        System.out.println("Пользователь " + login + " добавлен.");
    }

}


