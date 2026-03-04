package Encapsulation;

public class student {
    private String name;
     private int usn;
    static String college;

    student(String name, int usn) {
        this.name = name;
        this.usn = usn;
        this.college = "sapthagiri";


    }
    String getname(){
        return name;
    }
    int getusn(){
        return usn;
    }
    void printDetails(){
        System.out.println("Student name is ="+ name);
        System.out.println("Student usn is ="+ usn);
        System.out.println("College="+college);
    }
}
class driver{
    public static void main(String[] args){
        student s1= new student("pavan",83);
        student s2= new student("raj",123);






        s1.printDetails();
        s2.printDetails();
        System.out.println(s1.getname());
        s1.printDetails();






    }
}
