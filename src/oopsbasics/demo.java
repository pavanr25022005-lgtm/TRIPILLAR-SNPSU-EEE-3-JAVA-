package oopsbasics;

public class demo {
    void printdemo(){
        System.out.println("demo");
    }
}
class drivercode{
    static void main() {
        demo obj = new demo();
        obj.printdemo();
    }
}
