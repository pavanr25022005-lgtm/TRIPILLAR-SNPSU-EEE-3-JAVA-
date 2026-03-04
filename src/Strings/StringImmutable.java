package Strings;

public class StringImmutable {
    static void main() {
        String s1 = "Hello";
        s1.concat("World");
        System.out.println(s1);

        String s2 = s1.concat("World");
        System.out.println(s1);
        System.out.println(s2);
    }
}
