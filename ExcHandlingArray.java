import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.println("The value of arr[8] is " + arr[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
