class Student {
    int rollNo;
    String name;
    int[] marks;


    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        return total;
    }


    double calculateAverage() {
        return calculateTotal() / 5.0;
    }


    char calculateGrade() {
        double average = calculateAverage();
        if (average >= 90)
            return 'A';
        else if (average >= 75)
            return 'B';
        else if (average >= 60)
            return 'C';
        else if (average >= 40)
            return 'D';
        else
            return 'F';
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println();
    }
}
public class Studentresults {
  public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "Arun",
                new int[]{85, 90, 80, 85, 85});
        students[1] = new Student(2, "Priya",
                new int[]{95, 92, 90, 96, 94});
        students[2] = new Student(3, "Rahul",
                new int[]{70, 75, 80, 72, 78});
        int topperIndex = 0;
        for (int i = 0; i < students.length; i++) {
            students[i].display();
            if (students[i].calculateTotal() >
                students[topperIndex].calculateTotal()) {
                topperIndex = i;
            }
        }
        System.out.println("Topper: " +
                students[topperIndex].name);
    }
}

