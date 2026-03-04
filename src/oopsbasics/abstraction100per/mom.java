package oopsbasics.abstraction100per;

interface mom {
    void cook();
}
interface dad{
    void cook();
}
class child implements mom,dad{
    public void cook(){
        System.out.println("Indian");
    }
}
class conductor{
    static void main() {
        child c = new child();
        c.cook();


    }
}
