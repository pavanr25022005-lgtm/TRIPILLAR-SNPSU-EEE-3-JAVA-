package exceptionhandling;

class MyTask implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++){

            System.out.println("Thread is Running..");
        }
    }
}

public class demo {
    static void main() {
        MyTask obj = new MyTask();
        Thread t1 = new Thread(obj);
        t1.start();
        for (int i=0;i<10;i++){
            System.out.println("Main thread is running");
        }

    }
}
