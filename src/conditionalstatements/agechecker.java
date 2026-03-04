package conditionalstatements;

import java.util.Scanner;

public class agechecker {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int age=sc.nextInt();
        if (age>18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("ineligible to vote");
        }
    }
}
