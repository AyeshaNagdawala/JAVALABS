public class Abstract{
		public static void main(String[] args){
			B obj=new B();
	
				obj.display();
		}
	}
abstract class A{
	void display();
}
class B extends A{
	void display (){
		System.out.println("Hello I am Anmol");
	}
	/*public class abstract{
		public static void main(String[] args){
			B obj=new B();
	
				obj.display();
		}
	}*/
	