package oopsbasics.Abstract;

abstract class Animal {
    abstract void eat();
    void run(){
        System.out.println("Running");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("Meat");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Grass");
    }
}
class Driver{
    static void main() {
        Lion l = new Lion();
        l.eat();
        l.run();
        Deer d = new Deer();
        d.eat();
        d.run();

    }
}