package task4;
import java.util.ArrayList;
import java.util.List;
public class Student {
    String studentId;
    String name;
    List<Course> registeredCourses;
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }
}
