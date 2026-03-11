package Threads.threadsclass;

class Counter{
    static int count = 0;
    static void increment(){
        count++;
    }
}
class Mythread extends Thread{
    public void main(){
        for(int i=0; i<10; i++){
            Counter.increment();
        }
    }
}
public class Synchronization {
    static void main() {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch(Exception e){}
        System.out.println("Final Count:="+ Counter.count);
    }

}
