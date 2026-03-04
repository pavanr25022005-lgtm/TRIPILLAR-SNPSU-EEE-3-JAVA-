package ConditionsandlOOps;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long factorial = 1;

        // Calculate factorial using loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Output result
        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close();
    }
}
