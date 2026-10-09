import java.util.*;

class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for first array:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter rows and columns for second array:");
        int secrow = sc.nextInt();
        int seccol = sc.nextInt();


        if (row != secrow || col != seccol) {
            System.out.println("Arrays must have the same dimensions.");
            sc.close();
            return;
        }

        int[][] arr = new int[row][col];
        int[][] arr2 = new int[secrow][seccol];
        int[] sumArr = new int[row * col];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < secrow; i++) {
            for (int j = 0; j < seccol; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int k = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumArr[k] = arr[i][j] + arr2[i][j];
                k++;
            }
        }

        System.out.println("Sum of the array:");
        System.out.println(Arrays.toString(sumArr));

        sc.close();
    }
}

