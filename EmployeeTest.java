class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return salary + salary * 0.20;
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1, "Anu", 30000);
        Employee e2 = new PartTimeEmployee(2, "Ravi", 20, 200);

        e1.display();
        e2.display();
    }
}