package GarbageCollection.eligibility;

public class Demo {

    public static void main(String[] args) {
        for(int i=0; i<10000; i++){
            Demo obj = new Demo();
            obj = null;
        }
        System.gc();
    }
}
