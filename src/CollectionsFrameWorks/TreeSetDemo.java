package CollectionsFrameWorks;

import java.util.TreeSet;

public class TreeSetDemo {
    static void main() {
        TreeSet<Integer> set = new TreeSet<>();

        //add()
        set.add(30);
        set.add(20);
        set.add(40);

        System.out.println(set);

        //First()
        System.out.println(set.first());

        //last()
        System.out.println(set.last());

        //remove()
        set.remove(30);
        System.out.println(set);


        System.out.println("/**\n" +
                " * No duplicates are allowed\n" +
                " * Automatically sorts the element\n" +
                " * uses tree stucture internally\n" +
                " * slower than HashSet\n" +
                " * usefull when sorted data is needed\n" +
                " */");
    }
}


/**
 * No duplicates are allowed
 * Automatically sorts the element
 * uses tree stucture internally
 * slower than HashSet
 * usefull when sorted data is needed
 */