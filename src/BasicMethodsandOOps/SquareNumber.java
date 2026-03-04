package BasicMethodsandOOps;

import java.util.Scanner;

public class SquareNumber {
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Square is: " + square(num));

        sc.close();
    }
}
