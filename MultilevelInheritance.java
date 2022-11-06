import java.util.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks in phy and chem");
        int p=sc.nextInt();
        int q=sc.nextInt();
        int totalm;
        C c = new C ();
        totalm=c.total(p,q);
         System.out.println("Total Marks: "+totalm);
        int avgm;
        avgm=c.avg(totalm);
        System.out.println(" Average marks is: "+avgm);
        int extram;
        extram=c.extra(totalm);
        System.out.println(" After adding extra, marks is: "+extram);
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
class C extends B
{
     public int extra(int totalm)
    {
        return (totalm+20);
    }
}
    


