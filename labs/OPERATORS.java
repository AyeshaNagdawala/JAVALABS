import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		double a = sc.nextDouble();
		System.out.println("enter the value of b");
		double b = sc.nextDouble();
		int choice;
		
		do{
		    System.out.println("Operators in java:");
		    System.out.println("1.add\n2.sub\n3.multiply\n4.divide\n5.exit");
		    System.out.println("enter your choice");
		    choice = sc.nextInt();
		    switch(choice){
		    case 1 :System.out.println("a + b = "+ (a+b));
		    break;
		    
		    case 2 : System.out.println("a - b = "+ (a-b));
		    break;
		    
		    case 3 : System.out.println("a X b = "+ (a*b));
		    break;
		    
		    case 4 : System.out.println("a / b = "+ (a/b));
		    break;
		} 
	}while(choice!=5);
	}
}
