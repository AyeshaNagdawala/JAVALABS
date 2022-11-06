import java.util.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,q;
        System.out.println("Enter three values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        p=sum.add(a,b);
        q=sum.add(a,b,c);
        System.out.println("Multiplication answers are: "+p+" and "+q);
    }
}
class sum
{
    static int add(int a,int b,int c)
    {
        return a*b*c;
    }
    static int add(int a,int b)
    {
        return a*b;
    }
}

