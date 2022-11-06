public class try3{
	public static void main(String [] args){
		try{
			int a []={1,3,2,5};
			System.out.println(a[10]);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Rest of code");
	}
}