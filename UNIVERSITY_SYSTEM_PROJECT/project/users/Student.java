package users;

public class Student extends User{
	public Student(String login, String password) {
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
