import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns: ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int a[][] = new int [row][col];
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               System.out.println("Enter elements of the matrix row wise: ");
               a[i][j]=sc.nextInt();
            }
        }
         System.out.println("The matrix is: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                 System.out.print(a[i][j] +"  ");
            }
            System.out.println("\n");
        }
    }
}
