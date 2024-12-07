package users;

public class Admin extends User {
    private final UserDatabase database;

    public Admin(String login, String password) {
        super(login, password);
        this.database = UserDatabase.getInstance();
    }

    public void addUser(String login, String password) {
        database.addUser(login, password);
        System.out.println("Пользователь " + login + " добавлен.");
    }

	@Override
	public String getLogin() {
		return null;
	}

	@Override
	public String getPassword() {
		return null;
	}
}


