package conditionalstatements;

import java.util.Scanner;

public class empbonuscalc {
    static void main() {
        double bonus=0;
        double total;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary");
        int salary=sc.nextInt();
        if (salary<20000){
            bonus = (0.05*salary);
        }
        else if(salary<=40000){
            bonus = (0.10*salary);
        }
        else if(salary>40000){
            bonus = (0.15*salary);
        }
        total = salary+bonus;
        System.out.println("salary="+salary);
        System.out.println("bonus="+bonus);
        System.out.println("Total salary="+total);
        sc.close();

    }
}
