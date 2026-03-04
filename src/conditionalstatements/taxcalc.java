package conditionalstatements;

import java.util.Scanner;

public class taxcalc {
    static void main() {
        double tax;
        double total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();
        if (amount<=1000){
            tax = amount*0.05;
        }
        else if(amount<=5000){
            tax = amount*0.10;
        }
        else{
            tax = amount*0.15;
        }
        total = amount+tax;
        System.out.println("/nTax="+tax);
        System.out.println("/ntotal="+total);
        sc.close();
    }
}
