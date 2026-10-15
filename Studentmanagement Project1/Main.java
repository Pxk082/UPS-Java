
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter age: ");
                        int age = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter course: ");
                        String course = sc.nextLine();

                        if (id <= 0 || age <= 0 ||
                                name.isBlank() || course.isBlank() ||
                                name.contains("|") || course.contains("|")) {
                            System.out.println("Invalid student details.");
                            break;
                        }

                        Student student =
                                new Student(id, name, age, course);

                        if (manager.addStudent(student)) {
                            System.out.println("Student added!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ID and age must be numbers.");
                    }
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    try {
                        int id = Integer.parseInt(sc.nextLine());
                        Student student = manager.findStudent(id);

                        if (student != null) {
                            student.displayDetails();
                        } else {
                            System.out.println("Student not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                    }
                    break;

                case 4:
                    try {
                        System.out.print("Enter ID to update: ");
                        int id = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter new name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter new age: ");
                        int age = Integer.parseInt(sc.nextLine());

                        System.out.print("Enter new course: ");
                        String course = sc.nextLine();

                        if (age <= 0 || name.isBlank() ||
                                course.isBlank() ||
                                name.contains("|") || course.contains("|")) {
                            System.out.println("Invalid student details.");
                            break;
                        }

                        if (manager.updateStudent(id, name, age, course)) {
                            System.out.println("Student updated!");
                        } else {
                            System.out.println("Student not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number.");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    try {
                        int id = Integer.parseInt(sc.nextLine());

                        if (manager.deleteStudent(id)) {
                            System.out.println("Student deleted!");
                        } else {
                            System.out.println("Student not found.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
