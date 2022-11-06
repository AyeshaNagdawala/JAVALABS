import java.util.*;
import java.util.Scanner;

public class main
{
    public static void main(String args[])
    {
       try
       {
           int a=5/0;
           System.out.println("Rest of the code...");
       }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
       
