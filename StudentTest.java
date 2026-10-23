import java.util.*;

class Student {
    int roll;
    String name;
    int mark;

    Student(int roll, String name, int mark) {
        this.roll = roll;
        this.name = name;
        this.mark = mark;
    }

    void display() {
        System.out.println(roll + " " + name + " " + mark);
    }
}

class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Anu", 85));
        list.add(new Student(2, "Ravi", 70));
        list.add(new Student(3, "Meera", 92));
        list.add(new Student(4, "Arun", 65));
        list.add(new Student(5, "Priya", 80));

        System.out.println("Students scoring above 75:");
        for (Student s : list) {
            if (s.mark > 75) {
                s.display();
            }
        }

        int searchRoll = 3;
        for (Student s : list) {
            if (s.roll == searchRoll) {
                System.out.println("Student found:");
                s.display();

                s.mark = 95;
                System.out.println("Updated mark: " + s.mark);
                break;
            }
        }

        list.removeIf(s -> s.roll == 2);

        list.sort((a, b) -> Integer.compare(a.mark, b.mark));

        System.out.println("Students sorted by marks:");
        for (Student s : list) {
            s.display();
        }
    }
}