class obj{
    static int add(int x,int y){
    return x + y;        
    }
    static int add(int x,int y,int z){
    return x + y + z;
    }
}

public class Main{
    public static void main(String args []){
        int num1 = obj.add(4,6);
        int num2 = obj.add(4,6,10);
        System.out.println("x + y :" + num1);
        System.out.println("x + y + z :" + num1);
    }
}
