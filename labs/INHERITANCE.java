class Employee{
    String name;
    int regNo;
    
    void set1(String n){
        name = n;
    }
    String get1(){
        return name;
    }
    void set2(int r){
        regNo = r;
    }
    int get2(){
        return regNo;
    }
}

class Programmer extends Employee{
    int salary;
    void set3(int s){
        salary = s;
    }
    int get3(){
        return salary;
    }
}

public class Main{
	public static void main(String[] args) {
	    Programmer obj = new Programmer();
	    obj.set1("john");
	    obj.set2(123);
	    obj.set3(89000);
	    System.out.println("Employee details:");
	    System.out.println("name : "+obj.get1());
	    System.out.println("regNo : "+obj.get2());
	    System.out.println("salary : "+obj.get3());
	}
}
