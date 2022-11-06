class Multithreading1 implements Runnable{
    public void run(){
        System.out.println("My thread is running");
    }
    public static void main(String [] args){
        Multithreading1 obj=new Multithreading1();
        Thread tobj=new Thread(obj);
        tobj.start();
    }
}