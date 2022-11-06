class Multithreading2{
    public static void main(String [] args){
            hi obj1=new hi();
            hello obj2=new hello();
           
			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj2);
			t2.start();
			t1.start();
			
    }
}


class hello implements Runnable {
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello pikachu");
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}



class hi implements Runnable {
    public synchronized void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi pikachu");
                try {
                    Thread.sleep(0);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
    }
}


