import java.util.*;
import java.io.*;

class Employee {
    int id;
    String name, dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + dept + " " + salary;
    }
}

class EmployeeManager {
    static ArrayList<Employee> list = new ArrayList<>();
    static HashMap<Integer, Employee> map = new HashMap<>();
    static HashSet<Integer> ids = new HashSet<>();
    static Scanner sc = new Scanner(System.in);
    static String file = "employees.txt";

    static void add() {
        System.out.print("Enter ID, name, department, salary: ");
        int id = sc.nextInt();
        String name = sc.next();
        String dept = sc.next();
        double salary = sc.nextDouble();

        if (ids.contains(id)) {
            System.out.println("ID already exists");
            return;
        }

        Employee e = new Employee(id, name, dept, salary);
        list.add(e);
        map.put(id, e);
        ids.add(id);
        System.out.println("Employee added");
    }

    static void search() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (map.containsKey(id))
            System.out.println(map.get(id));
        else
            System.out.println("Employee not found");
    }

    static void update() {
        System.out.print("Enter ID and new salary: ");
        int id = sc.nextInt();
        double salary = sc.nextDouble();

        if (map.containsKey(id)) {
            map.get(id).salary = salary;
            System.out.println("Salary updated");
        } else {
            System.out.println("Employee not found");
        }
    }

    static void delete() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        if (map.containsKey(id)) {
            Employee e = map.remove(id);
            list.remove(e);
            ids.remove(id);
            System.out.println("Employee deleted");
        } else {
            System.out.println("Employee not found");
        }
    }

    static void display() {
        for (Employee e : list)
            System.out.println(e);
    }

    static void save() throws IOException {
        FileWriter fw = new FileWriter(file);

        for (Employee e : list)
            fw.write(e.id + " " + e.name + " " + e.dept + " " + e.salary + "\n");

        fw.close();
        System.out.println("Records saved");
    }

    static void load() throws IOException {
        File f = new File(file);
        if (!f.exists())
            return;

        BufferedReader br = new BufferedReader(new FileReader(f));
        String line;

        while ((line = br.readLine()) != null) {
            String[] a = line.split(" ");
            int id = Integer.parseInt(a[0]);

            if (!ids.contains(id)) {
                Employee e = new Employee(id, a[1], a[2],
                        Double.parseDouble(a[3]));
                list.add(e);
                map.put(id, e);
                ids.add(id);
            }
        }
        br.close();
    }

    public static void main(String[] args) {
        try {
            load();

            while (true) {
                System.out.println("\n1.Add 2.Search 3.Update Salary");
                System.out.println("4.Delete 5.Display 6.Save and Exit");
                System.out.print("Choose: ");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1: add(); break;
                    case 2: search(); break;
                    case 3: update(); break;
                    case 4: delete(); break;
                    case 5: display(); break;
                    case 6:
                        save();
                        return;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}