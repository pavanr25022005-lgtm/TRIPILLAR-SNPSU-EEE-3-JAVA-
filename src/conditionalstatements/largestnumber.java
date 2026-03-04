package conditionalstatements;

import java.util.Scanner;

public class largestnumber {
    static void main() {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        num1 = sc.nextInt();
        System.out.println("Enter num2");
        num2 = sc.nextInt();
        System.out.println("Enter num3");
        num3 = sc.nextInt();
        System.out.println("Enter num1");
        num1 = sc.nextInt();
        System.out.println("Enter num2");
        num2 = sc.nextInt();
        System.out.println("Enter num3");
        num3 = sc.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("num1 is greater");
        }
        else if (num2>num3){
            System.out.println("num2 is greater");
        }
        else{
            System.out.println("num3 is greater");
        }
    }
}