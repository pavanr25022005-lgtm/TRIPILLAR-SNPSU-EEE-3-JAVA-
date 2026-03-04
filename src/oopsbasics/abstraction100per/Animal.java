package oopsbasics.abstraction100per;

public interface  Animal {
    void eat();
    void run();
}
class Dog implements Animal{
     public void eat(){
         System.out.println("eat");
     }
     public void run(){
         System.out.println("run");
     }
}
class cat implements Animal{
    public void eat(){
        System.out.println("dog eats cat");
    }
    public void run(){
        System.out.println("cat runs form Dog");
    }
}
class drivers {
    static void main() {
        Dog d = new Dog();
        d.eat();
        d.run();
        cat c = new cat();
        c.eat();
        c.run();


    }
}