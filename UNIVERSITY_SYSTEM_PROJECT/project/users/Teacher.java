package users;

public class Teacher extends User{
	public Teacher(String login, String password) {
		super(login, password);
	}

	
	@Override
	public String getLogin() {
		return login;
	}

	@Override
	public String getPassword() {
		return password;
	}
}
