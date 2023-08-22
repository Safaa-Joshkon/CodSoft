//Safaa Joshkon- Task4
package task4;
import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        Student student = new Student("1213", "Safaa Joshkon");
        Course course1 = new Course("CSCI200", "Introduction to Computers", "Introductory course", "MW 9:00 AM - 10:45 AM", 20);
        Course course2 = new Course("MATH160", "Calculus1", "Remedial", "TTH 11:00 AM - 12:45 PM", 15);
        courses.add(course1);
        courses.add(course2);
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1. Display Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            if (choice == 1) 
                displayAvailableCourses(courses);
            else if (choice == 2) 
                registerCourse(student, courses);
            else if (choice == 3) 
                dropCourse(student, courses);
            else if (choice == 0) 
                System.out.println("Exit the system.");
            else 
                System.out.println("Invalid choice.");
        }
    }
    public static void displayAvailableCourses(List<Course> courses) {
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println("Course Code: " + course.code);
            System.out.println("Title: " + course.title);
            System.out.println("Description: " + course.description);
            System.out.println("Schedule: " + course.schedule); 
            System.out.println("Available Slots: " + course.availableSlots);
            System.out.println();
        }
    }
    public static void registerCourse(Student student, List<Course> courses) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the course code to register: ");
        String courseCode = scan.nextLine();
        Course selectedCourse = null;
        for (Course course : courses) {
            if (course.code.equals(courseCode)) {
                selectedCourse = course;
                break;
            }
        }
        if (selectedCourse == null) {
            System.out.println("Course not found.");
            return;
        }
        if (selectedCourse.availableSlots > 0) {
            student.registeredCourses.add(selectedCourse);
            selectedCourse.availableSlots--;
            System.out.println("Registered " + selectedCourse.title + " successfully!");
        } 
        else 
            System.out.println("Course is full. You can join the waitlist.");
    }
    public static void dropCourse(Student student, List<Course> courses) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the course code to drop: ");
        String courseCode = scanner.nextLine();
        Course selectedCourse = null;
        for (Course course : student.registeredCourses) {
            if (course.code.equals(courseCode)) {
                selectedCourse = course;
                break;
            }
        }
        if (selectedCourse == null) {
            System.out.println("Course not found in your registered courses.");
            return;
        }
        student.registeredCourses.remove(selectedCourse);
        selectedCourse.availableSlots++;
        System.out.println("Dropped " + selectedCourse.title + " successfully!");
    }
    
}
