import java.util.Scanner;

class ConsoleDemo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int num = a.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}