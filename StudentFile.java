import java.io.*;
import java.util.*;

class StudentFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = "students.txt";

        try {
            FileWriter fw = new FileWriter(file);

            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter ID, name and marks: ");
                int id = sc.nextInt();
                String name = sc.next();
                int marks = sc.nextInt();

                fw.write(id + " " + name + " " + marks + "\n");
            }
            fw.close();

            System.out.println("\nStudent Records:");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            String top = "";
            int max = -1;

            while ((line = br.readLine()) != null) {
                System.out.println(line);

                String[] a = line.split(" ");
                int marks = Integer.parseInt(a[2]);

                if (marks > max) {
                    max = marks;
                    top = line;
                }
            }
            br.close();

            System.out.println("Highest Marks: " + top);

            FileWriter fw2 = new FileWriter(file, true);
            fw2.write("6 NewStudent 90\n");
            fw2.close();

            System.out.println("New student appended.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}