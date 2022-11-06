import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        System.out.println("Entered string is "+s);
        
        System.out.println("Length of the string is: "+s.length());
        System.out.println("The fifth letter in the string is: "+s.charAt(4));
        System.out.println("Converting the string to upper case"+s.toUpperCase());
    }
}
