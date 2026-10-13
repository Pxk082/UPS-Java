
// Method Overloading

public class overloader {

    int calculate(int a, int b) {
        return a + b;
    }

    int calculate(int a, int b, int c) {
        return a + b + c;
    }

    int calculate(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    double calculate(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        overloader obj = new overloader();

        System.out.println(obj.calculate(10, 20));
        System.out.println(obj.calculate(10, 20, 30));
        System.out.println(obj.calculate(10, 20, 30, 40));
        System.out.println(obj.calculate(2.5, 4.0));
    }
}












