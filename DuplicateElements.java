import java.util.Scanner;
public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Duplicate elements: ");
        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
   if (isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}



