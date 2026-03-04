package conditionalstatements;

import java.util.Scanner;

public class loops {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = 5;
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "X" + i + "=" + n * i);
        }
    }
}