import java.util.*;

//complex No
public class Main
{
    public static void main (String args[])
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter real and imaginary value 1");
    int r1=sc.nextInt();
    int i1=sc.nextInt();
    System.out.println("Enter real and imaginary value 2");
    int r2=sc.nextInt();
    int i2=sc.nextInt();
    //int addition,subtraction,multiplication;
    Complex.add(r1,r2,i1,i2);
    Complex.sub(r1,r2,i1,i2);
    Complex.mult(r1,r2,i1,i2);
    //System.out.println("The addition is "+);
}
}

 class Complex
{
   static public void add(int r1,int r2, int i1,int i2)
    {
        int real=r1+r2;
        int imag=i1+i2;
        System.out.println("The addition is "+ real +" + i"+ imag);
    }
  static  public void sub(int r1,int r2, int i1,int i2)
    {
        int real=r1-r2;
        int imag=i1-i2;
        System.out.println("The subtraction is "+ real +" - i"+ imag);
    }
   static public void mult(int r1,int r2, int i1,int i2)
    {
        int real=r1*r2-i1*i2;
        int imag=r1*i2+i1*r2;
        System.out.println("The multiplication is "+ real +" + i"+ imag);
    }
}
