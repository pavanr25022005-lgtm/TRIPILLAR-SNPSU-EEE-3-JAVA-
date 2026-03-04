package Threads.threadsclass;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            ;
            System.out.println("thread is running");
        }
    }
}
public class Demo {
    static void main() {
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 0; i < 10; i++) {
            ;

            System.out.println("Main Thread is running...");
        }
    }
}