package BasicMethodsandOOps;

import java.util.Scanner;

class NumberCheck {

    // Method to check positive, negative, or zero
    void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        NumberCheck obj = new NumberCheck();
        obj.checkNumber(num);

        sc.close();
    }
}
