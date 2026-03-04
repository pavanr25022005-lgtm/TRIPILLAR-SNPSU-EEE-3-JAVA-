package exceptionhandling;

public class E3 {
    static void main() {
        int age = 69;
        if(age>=18){
            System.out.println("allowed");
        }else{
            throw new RuntimeException("Access denied");
        }
    }
}
