package conditionalstatements;

import java.util.Scanner;

public class marks {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int marks = sc.nextInt();
        if (marks==85) {
            System.out.println("distinction");
        }
         else if (marks<85) {
            System.out.println("firstclass");
        }
         else if (marks>85) {
            System.out.println("topper");
        }

    }
}
