package exceptionhandling;

public class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String msg){
        super(msg);
    }
}
class driver{
    static void chechAge(int age){
        if(age<18){
            throw new InvalidAgeException("age must be over 18");
        }
        System.out.println("he is eligible");
    }

    static void main() {
        chechAge(100);
    }
}


