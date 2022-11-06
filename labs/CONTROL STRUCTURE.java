// Control structures are programming blocks that can change the path we take through those instructions.
/* 1) Decision Making statements -
if statements ,switch statement
2) Loop statements -
do while loop, while ,loop for loop ,for-each loop
3) Jump statements -
break statement ,continue statement  */

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	  int fact =1;
		System.out.println("Factorial of number");
		System.out.println("enter value of n");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
		    fact = fact * i ;
		}
		System.out.printf("Factorial of %d is : %d \n",n,fact);
		
		System.out.println("Fibonacci series");
		System.out.println("enter the value of f");
		int f = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		
		for(int i=0;i<f;i++){
		    int temp = n1 + n2;
		    n1 = n2;
		    n2 = temp;
		    temp = n1 ;
		    System.out.println(n1);
		}		
	}
}
