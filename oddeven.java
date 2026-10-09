

import java.util.*;

class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println(n+ "  is Even");
                break;

            case 1:
            case -1:
                System.out.println(n+ "   is  Odd");
                break;
        }

        sc.close();
    }
}