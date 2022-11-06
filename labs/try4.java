public class try4{
	public static void main(String [] args){
		try{
			int a []=new int[4];
			//int b=4/0;
			a[10]=143;
			int b=4/0;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception Handled");
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bound handled");
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
		finally{
			System.out.println("Finally block executed");
		}
		System.out.println("Rest of code");
	}
}