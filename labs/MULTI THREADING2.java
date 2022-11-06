import java.lang.*;

class Mythread1 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",19,i,19*i);
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

class Mythread2 implements Runnable{
    @Override
    public void run(){
        for(char c = 'A'; c<='Z' ; c++){
            System.out.println(c);
        }
        try{
        Thread.sleep(100);
        } 
        catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

public class Main{
	public static void main(String[] args) {
		Mythread1 r1 = new Mythread1();
		Thread t1 = new Thread(r1);
		
		Mythread2 r2 = new Mythread2();
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
