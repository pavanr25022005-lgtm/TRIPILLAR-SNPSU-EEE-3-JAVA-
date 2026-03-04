package BasicMethodsandOOps;

import java.util.Scanner;

class Student {
    String name;
    int marks;

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        System.out.print("Enter marks: ");
        s.marks = sc.nextInt();

        s.displayDetails();

        sc.close();
    }
}
