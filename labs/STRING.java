import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String str = sc.next();
        System.out.println("name entered by you is : "+ str);
        
        System.out.println("\nstring class method");
        System.out.println("length of string is : "+ str.length());
        System.out.println("char at 4rd postion is : "+ str.charAt(3));       // n-1 index , as it start from zero
        System.out.println("toUpperCase convert string : "+ str.toUpperCase());
    }
}
