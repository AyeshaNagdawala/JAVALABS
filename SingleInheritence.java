import java.util.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in phy and chem");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int totalm;
        B b = new B ();
        totalm=b.total(p,q);
         System.out.println("Total Marks: "+totalm);
        int avgm;
        avgm=b.avg(totalm);
        System.out.println(" Average marks is: "+avgm);
    }
}
class A
{
    public int total(int p,int q)
    {
        return p+q;
       
    }
}
class B extends A
{
    public int avg(int totalm)
    {
        return (totalm/2);
    }
}

