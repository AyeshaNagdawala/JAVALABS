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
        mult obj1=new mult();
        mult obj2= new mult();
        p=obj1.mult(a,b,c);
        q=obj2.mult(a,b);
        System.out.println("Multiplication answers are: "+p+" and "+q);
    }
}
class mult
{
    static int mult(int a,int b,int c)
    {
        return a*b*c;
    }
    static int mult(int a,int b)
    {
        return a*b;
    }
}

