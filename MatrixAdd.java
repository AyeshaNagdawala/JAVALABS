import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row for the matrix:");
        int row = sc.nextInt();
        System.out.println("Enter number of col fo2r the matrix:");
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("Enter the element a" + (i + 1) + (j + 1));
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("Enter the element b" + (i + 1) + (j + 1));
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of the two matrix: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(a[i][j] + b[i][j] + "  ");
            }
            System.out.println("\n");
        }

    }
}
