package conditionalstatements;

import java.util.Scanner;

public class tristar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int size=sc.nextInt();
        for(int i=1; i<size; i++){
            for(int j=1; j<=size-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            for (int i1= size - 1; i1 >= 1; i1--) {
                for (int j = size; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
