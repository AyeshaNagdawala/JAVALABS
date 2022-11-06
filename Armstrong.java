import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked for Armstrong: ");
       int n = sc.nextInt();
       int rem,temp=n,sum=0;
       while(n>0)
       {
           rem=n%10;
           sum=sum+(rem*rem*rem);
           n=n/10;
       }
       if(sum==temp)
       {
           System.out.println("The number is an armstrong number");
       }
       else
       {
            System.out.println("The number is not an armstrong number");
                
       }
    }
}
