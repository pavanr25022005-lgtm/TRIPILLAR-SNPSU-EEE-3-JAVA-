package Threads.threadsclass;

class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 is Running");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
        public class DemoJava {
        public static void main(String[] args) {
            myThread t1 = new myThread();
            t1.start();
            try {
                t1.join();
            } catch (Exception e) {
            }

            for (int i = 0; i < 10; i++) {
                System.out.println("Main thread is running");
                try {
                    Thread.sleep(5000);

                } catch (Exception e) {}
            }

        }
    }

