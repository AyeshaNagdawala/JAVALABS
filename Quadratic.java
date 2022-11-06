import java.util.*;
import java.util.Scanner;

public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("For an equation ax^2+bx+c :");
        System.out.println("Enter a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double x1,x2;
        x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println("The roots of the equation are : " +x1+ " and " +x2);
  
    }
}

