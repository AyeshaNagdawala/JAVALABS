import java.util.*;
import java.util.Scanner;

public class main
{
    public static void main(String args[])
    {
       try
       {
           int arr[]={1,2,3,4,5};
           System.out.println(arr[8]);
           System.out.println("Rest of the code");
           
       }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
       
