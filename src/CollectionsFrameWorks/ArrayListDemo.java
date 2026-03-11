package CollectionsFrameWorks;

import ARRAYS.ArrayDemo1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListDemo {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println("List are =" + list);

        //get()
        System.out.println("Element at Index 1" + list.get(1));

        //size()
        System.out.println("Size =" + list.size());

        //contains()
        System.out.println("Contains =" + list.contains(30));

        //remove()
        list.remove(2);
        System.out.println("After Removing Index 2=" + list );
    }
}

/**
 * Maintains the insertion order
 * Allows Duplications
 * Dynamic in size
 * index based access
 * reading elements is faster
 */