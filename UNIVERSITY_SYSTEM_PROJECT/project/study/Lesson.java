package study;

import java.util.ArrayList;
import java.util.List;

import employee.Teacher;
import users.Student;

public class Lesson {
    private String topic;
    private Teacher teacher;
    private List<Student> students;
    
    public Lesson(String topic, Teacher teacher) {
        this.topic = topic;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    
    
    
    
    
     
}
