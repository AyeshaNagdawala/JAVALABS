import java.util.*;
//import java.util.Scanner;
import java.lang.*;

public class main
{
    public static void main(String args[])
    {
        hello obj1 = new hello();
        hi obj2 = new hi();
        
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        
        t1.start();
        t2.start();
    }
}
    
    class hello implements Runnable
    {
        public void run()
        {
            int i;
            for(i=0;i<=5;i++)
            {
                System.out.println("Hello");
                try
                {
                    Thread.sleep(2000);
                }
                catch(Exception e)
                { };
            }
        }
    }

class hi implements Runnable
{
    public void run()
    {
        int i;
        for(i=0;i<=6;i++)
        {
            System.out.println("Hi");
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {};
            
        }
    }
}

