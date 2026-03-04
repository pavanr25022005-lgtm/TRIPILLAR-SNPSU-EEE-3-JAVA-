package oopsbasics.polymorphyism;
class India {
    void Capital(){
        System.out.println("New Delhi");
    }
}
class USA {
    void Capital(){
        System.out.println("Washington DC");
    }
}
class driver {
    static void main() {
        India I = new India();
        I.Capital();
        USA I1 = new USA();
        I1.Capital();
    }
}