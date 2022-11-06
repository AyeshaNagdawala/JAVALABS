import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for the square matrix: ");
        int row=sc.nextInt();
        int a[][] = new int [row][row];
        int b[][] = new int [row][row];
        int c[][] = new int [row][row];
        int i,j;
        for(i=0;i<row;i++)
        {
            for(j=0;j<row;j++)
            {
               System.out.println("Enter elements of the first matrix row wise: ");
               a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<row;j++)
            {
               System.out.println("Enter elements of the second matrix row wise: ");
               b[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Addition of the two matrix: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<row;j++)
            {
               c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j]+ "  ");
            }
            System.out.println("\n");
        }
         
        
    }
}
