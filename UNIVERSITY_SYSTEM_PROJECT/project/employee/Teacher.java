package employee;

import java.util.List;

import study.Course;
import users.User;

public class Teacher extends Employee{
    private List<Course> courses;
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
	
    public void assignCourse(Course course) {
        courses.add(course);
    }
}
