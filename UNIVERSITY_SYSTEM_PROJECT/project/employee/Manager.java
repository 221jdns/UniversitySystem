package employee;

import java.util.List;

import study.Course;
import users.UserDatabase;

public class Manager {
    private final UserDatabase database;
    private List<Course> courses;


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
    
    public void addCourseForRegistration(Course course, String major, int yearOfStudy) {
        course.setMajor(major);
        course.setYearOfStudy(yearOfStudy);
        courses.add(course);
        System.out.println("Course " + course.getCourseName() + " added for major: " + major + ", year: " + yearOfStudy);
    }

    public List<Course> getAvailableCourses() {
        return courses;
    }
    
    
}

