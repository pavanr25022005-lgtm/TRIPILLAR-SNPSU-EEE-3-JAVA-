package exceptionhandling;

public class E5 {
    static void main() {
        try {
            int balance = 2000;
            int withdraw = 3000;
            if (withdraw > balance) {
                throw new RuntimeException("Insufficient Balance");
            }
            System.out.println("withdraw Succesfull");
        } catch (ArithmeticException e) {
            System.out.println(("Exception caught=") + e.getMessage());
        }
    }
}
