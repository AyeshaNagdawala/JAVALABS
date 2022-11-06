import java.util.*;
//for input
import java.util.Scanner;

public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number for factorial :");
        //for input
        int n=sc.nextInt();
        int i;
        int fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is :"+fact);
        //sc.close();
    }
}
