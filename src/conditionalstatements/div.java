package conditionalstatements;

import java.util.Scanner;

public class div {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int n=sc.nextInt();
        if (n%3==0 && n%7==0){
            System.out.println("The number is divisible by 3 and 7");
        }
        else{
            System.out.println("The number is not divisible by 3 and 7");
        }
    }
}
