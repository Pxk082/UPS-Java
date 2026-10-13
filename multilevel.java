
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car charges");
    }
}

public class multilevel{
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();

        e.start();
        e.drive();
        e.charge();
    }
}