package WrapperClass;

public class PrimToObj {             // old method in java
    static void main() {
        int x = 10;
        Integer obj = new Integer(x);   //Manual Boxing

        System.out.println("primitive value = " + x);
        System.out.println("object value = " + obj);
    }
}
