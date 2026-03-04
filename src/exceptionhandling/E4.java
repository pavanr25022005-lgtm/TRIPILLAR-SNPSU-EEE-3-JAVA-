package exceptionhandling;

import java.util.Scanner;

public class E4 {
    static void main() {
        double bill;
        double total;
        double tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit");
        int unit=sc.nextInt();
        if(unit<=100){
            bill = unit * 2;
        }
        else if(unit<=200){
            bill = unit * 3;
        }
        else{
            throw new RuntimeException("only 200 units is free in karnataka");
        }
        tax = bill * 0.08;
        total = bill + tax;

        System.out.println("/n BILL AMOUNT="+bill);
        System.out.println("/n TAX="+tax);
        System.out.println("/n TOTAL AMOUNT="+total);
        sc.close();

    }
}
