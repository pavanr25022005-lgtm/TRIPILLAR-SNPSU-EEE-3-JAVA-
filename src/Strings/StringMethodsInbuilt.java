package Strings;

public class StringMethodsInbuilt {
    static void main() {
        String s1 = "Java Programming";
        String s2 = new String("Java Programming");

        System.out.println("Original String ="+s1);

        //length()
        System.out.println("Length ="+s1.length());

        //charAt()
        System.out.println("character at index ="+ s1.charAt(2));

        //toUppercase() and tolowercase()
        System.out.println("Uppercase ="+s1.toUpperCase());
        System.out.println("Lowercase ="+s1.toLowerCase());

        //equals() and ==
        System.out.println("Using == ="+(s1==s2));
        System.out.println("Using equals ="+s1.equals(s2));

        //compareTo()
        System.out.println("Compare ="+s1.compareTo(s2));

        //substring()
        System.out.println("Substring 0 to 4 ="+ s1.substring(0,4));

        //contain()
        System.out.println("Contains 'Program ="+s1.contains("program"));

        //Indexof()
        System.out.println("Index of a ="+ s1.indexOf("a"));

        //replace()
        System.out.println("Replace JAVA to PYTHON =" +s1.replace("java","python"));

        //trim()
        String s3 ="      Hello world   ";
        System.out.println("before trim = "+ s3);
        System.out.println("After trim ="+s3.trim());

        //concat()
        System.out.println("Concat ="+s1.concat("PAVAN"));

        //isEmpty()
        String s4 = " ";
        System.out.println("Is Empty="+ s4.isEmpty());

        //split()
        String Sentence ="Java is a programming language";
        String[] arr=Sentence.split(" ");

        for(String i : arr){
            System.out.println(i);
        }
    }
}
