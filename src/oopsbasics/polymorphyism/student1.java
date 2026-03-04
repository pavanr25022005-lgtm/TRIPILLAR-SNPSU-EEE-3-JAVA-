package oopsbasics.polymorphyism;

public class student1 {
    void college(){
        System.out.println("sapthagiri");
    }
}
class student2 {
    void college(){
        System.out.println("sapthagiri NPS");
    }
}
class Drivers{
    static void main() {
        student1 s1 = new student1();
        s1.college();
        student2 s2 = new student2();
        s2.college();
    }
}
