import java.util.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        B b = new B ();
        b.disp1();
        b.disp2();
    }
}
class A
{
    public void disp1()
    {
        System.out.println("Hi I am A");
    }
}
class B extends A
{
    public void disp2()
    {
        System.out.println("Hi I am B");
    }
}

