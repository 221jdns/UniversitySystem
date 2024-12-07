package users;

import java.util.List;

import study.Course;

public class Student extends User{
	private double gpa;
    private static final int MAX_CREDITS = 21;
    private int yearOfStudy;
    private List<Course> courses;
    
	public Student(String login, String password) {
		super(login, password);
	}
	
    public Student(String login, String password,String id, String name, String email, double gpa, int yearOfStudy) {
        super(login, password, id, name , email);
        this.gpa = gpa;
        this.yearOfStudy = yearOfStudy;
    }
    
	
    public void registerCourse(Course course) {
        courses.add(course);
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
