import java.util.*;
import java.util.Scanner;

public class MatrixMul {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row for the matrix 1:");
        int row1 = sc.nextInt();
        System.out.println("Enter number of col fo2r the matrix 1:");
        int col1 = sc.nextInt();
        System.out.println("Enter number of row for the matrix 2:");
        int row2 = sc.nextInt();
        System.out.println("Enter number of col fo2r the matrix 2:");
        int col2 = sc.nextInt();

        if (row2 != col1) {

            System.out.println(
                    "\nMultiplication Not Possible");
            return;
        }

        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int c[][] = new int[row1][col2];

        int i, j, k;
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col1; j++) {
                System.out.println("Enter the element a" + (i + 1) + (j + 1));
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < row2; i++) {
            for (j = 0; j < col2; j++) {
                System.out.println("Enter the element b" + (i + 1) + (j + 1));
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Multiplicaton of the two matrix: ");
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
}
