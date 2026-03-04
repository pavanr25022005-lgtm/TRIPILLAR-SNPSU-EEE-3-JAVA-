package Strings.BufferandBuilder;

public class Stringbuffer {
    static void stringAppend() {
        StringBuffer sbf = new StringBuffer("hello");
        System.out.println("Original String is =" + sbf);
        sbf.append("World");
        System.out.println("New String is=" + sbf);
    }

    static void stringinsert() {
        StringBuffer sbf = new StringBuffer("hello");
        System.out.println("Original String is =" + sbf);
        sbf.insert(4,"nkn lyy");
        System.out.println("New String is=" + sbf);
    }

    static void stringReverse() {
        StringBuffer sbf = new StringBuffer("hello");
        System.out.println("Original String is =" + sbf);
        sbf.reverse();
        System.out.println("New String is=" + sbf);
    }
    public static void main(String[] args) {
    stringAppend();
    stringinsert();
    stringReverse();
    }
}