package oopsbasics.multipleinheritence;
class Greatgrandparents {
    void height(){
        System.out.println("Height...");
    }
}
class Grandparents extends Greatgrandparents {
    void color(){
        System.out.println("Color...");
    }
}
class Parents extends Grandparents{
    void muscle(){
        System.out.println("Memory");
    }
}
class Child extends Parents{
    void angry(){
        System.out.println("Angry");
    }
}
class driver{
static void main(String[] args){
    Greatgrandparents g = new Greatgrandparents();
    g.height();

    Grandparents g1 = new Grandparents();
    g.height();
    g1.color();

    Parents g2 = new Parents();
    g.height();
    g1.color();
    g2.muscle();

    Child g3 = new Child();
    g.height();
    g1.color();
    g2.muscle();
    g3.angry();





}
}
