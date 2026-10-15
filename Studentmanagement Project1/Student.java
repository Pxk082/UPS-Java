
import java.time.LocalDateTime;

public class Student extends Person {
    private int id;
    private String course;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Student(int id, String name, int age, String course) {
        super(name, age);
        this.id = id;
        this.course = course;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = this.createdAt;
    }

    public Student(int id, String name, int age, String course,
                   LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(name, age);
        this.id = id;
        this.course = course;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setDetails(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.updatedAt = LocalDateTime.now();
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Created: " + createdAt);
        System.out.println("Last Updated: " + updatedAt);
    }
}
