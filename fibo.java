import java.util.*;
import java.util.Scanner;


public class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int sum=0;
        int i;
        System.out.println("enter the number:");
        int n = sc.nextInt();
        for(i=0;i<n;i++)
        {
             System.out.println(sum);
            a=b;
            b=sum;
            sum=a+b;
        }
    }
}
    
