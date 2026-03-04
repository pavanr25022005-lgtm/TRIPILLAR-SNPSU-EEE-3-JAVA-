package oopsbasics.polymorphyism;

public class Mom {
    void cook(){
        System.out.println("Indian");
    }
}
class daughter extends Mom {
    void cook(){
        System.out.println("Chinese");
    }
}
class Driver{
    static void main() {
        Mom m = new Mom();
        m.cook();
        daughter d = new daughter();
        d.cook();
    }
}


