public class try2{
	public static void main(String [] args){
		try{
		int a=40/0;
		System.out.println("rest of the code");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}