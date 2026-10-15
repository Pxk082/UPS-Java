
import java.util.*;

public class StudentManager {
    private final List<Student> students;
    private final FileHandler fileHandler;

    public StudentManager() {
        fileHandler = new FileHandler();
        students = fileHandler.loadStudents();
    }

    // CREATE
    public boolean addStudent(Student student) {
        if (findStudent(student.getId()) != null) {
            System.out.println("Student ID already exists.");
            return false;
        }

        students.add(student);
        fileHandler.saveStudents(students);
        return true;
    }

    // READ
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayDetails();
            System.out.println("--------------------");
        }
    }

    public Student findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    // UPDATE
    public boolean updateStudent(
            int id, String name, int age, String course) {

        Student student = findStudent(id);

        if (student == null) {
            return false;
        }

        student.setDetails(name, age, course);
        fileHandler.saveStudents(students);
        return true;
    }

    // DELETE
    public boolean deleteStudent(int id) {
        Student student = findStudent(id);

        if (student == null) {
            return false;
        }

        students.remove(student);
        fileHandler.saveStudents(students);
        return true;
    }
}
