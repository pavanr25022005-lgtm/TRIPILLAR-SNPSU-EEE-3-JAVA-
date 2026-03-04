package oopsbasics.Inheritence;

public class Animal {
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends Animal{
     void bark(){
        System.out.println("Bark...");
    }
}
class Puppy extends Dog{
    void cry(){
        System.out.println("Cry...");
    }
}
class dog extends Puppy{
    void feed(){
        System.out.println("Feed the puppy");
    }
}
class driver {
    public static void main(String[] args)  {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();
        d.bark();

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.cry();

        dog D = new dog();
        p.eat();
        p.bark();
        p.cry();


    }
}