package task4;
public class Course {
    String code;
    String title;
    String description;
    int capacity;
    String schedule;
    int availableSlots; 

    public Course(String code, String title, String description, String schedule, int capacity) {
        this.code = code;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.availableSlots = capacity;
    }
}
