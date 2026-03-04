package conditionalstatements;

import java.util.Scanner;

public class studentgrades {
    static void main() {
        int sub1,sub2,sub3,sub4,sub5,total;
        float percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sub1");
        sub1 = sc.nextInt();
        System.out.println("Enter sub2");
        sub2 = sc.nextInt();
        System.out.println("Enter sub3");
        sub3 = sc.nextInt();
        System.out.println("Enter sub4");
        sub4 = sc.nextInt();
        System.out.println("Enter sub5");
        sub5 = sc.nextInt();
        total = sub1+sub2+sub3+sub4+sub5;
        percentage = (total/500)*100 ;
        if(percentage >= 75){
            System.out.println("Grade A");
        }
        else if(percentage>50){
            System.out.println("Grade B");
        }
        else if(percentage>35){
            System.out.println("Grade C");
        }
        else{
            System.out.println("******#$DADDY IS HOME#$******");
        }

    }
}
