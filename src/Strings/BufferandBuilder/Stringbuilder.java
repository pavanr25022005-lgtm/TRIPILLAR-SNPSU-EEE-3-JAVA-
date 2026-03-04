package Strings.BufferandBuilder;

public class Stringbuilder {
    static void stringAppend() {
        StringBuilder sbf = new StringBuilder("hello");
        System.out.println("Original String is =" + sbf);
        sbf.append("World");
        System.out.println("New String is=" + sbf);
    }

    static void stringinsert() {
        StringBuilder sbf = new StringBuilder("hello");
        System.out.println("Original String is =" + sbf);
        sbf.insert(4,"omg");
        System.out.println("New String is=" + sbf);
    }

    static void stringReverse() {
        StringBuilder sbf = new StringBuilder("hello");
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

