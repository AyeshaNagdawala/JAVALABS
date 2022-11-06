import java.util.*;
import java.util.Scanner;

public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter numerator and denominator:");
        int n = sc.nextInt();
       int d = sc.nextInt();
      
       try
       {
           System.out.println("Answer is: " +(n/d));
       }
        catch(Exception e)
        {
            System.out.println("division by zero");
        }
    }
}
       
