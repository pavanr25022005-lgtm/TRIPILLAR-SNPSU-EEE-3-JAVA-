package conditionalstatements;

import java.util.Scanner;

public class movieticket {
    static void main() {
        int ticketprice = 200;
        double total;
        double discount;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        if (age<12){
            discount = (0.50*ticketprice);
        }
        else if(age>=60){
            discount = (0.30*ticketprice);
        }
        else{
            discount = (0);
        }
        total = (ticketprice - discount);
        System.out.println("ticket price="+ticketprice);
        System.out.println("discount="+discount);
        System.out.println("Total amount="+total);
        sc.close();


    }
}
