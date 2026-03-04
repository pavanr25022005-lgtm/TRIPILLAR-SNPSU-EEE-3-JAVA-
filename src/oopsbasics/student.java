package oopsbasics;
class  Student {
    String name;
    int usn;
    static String college;

    Student(String name, int usn) {
        this.name = name;
        this.usn = usn;
        this.college = "sapthagiri";


    }
    void printDetails(){
        System.out.println("Student name is ="+ name);
        System.out.println("Student usn is ="+ usn);
        System.out.println("College="+college);
    }
}
    class driver{
        public static void main(String[] args){
            Student s1= new Student("pavan",83);
            Student s2= new Student("naveen",78);
            Student s3= new Student("sujith",113);



            s1.printDetails();
            s2.printDetails();
            s3.printDetails();






        }
    }

