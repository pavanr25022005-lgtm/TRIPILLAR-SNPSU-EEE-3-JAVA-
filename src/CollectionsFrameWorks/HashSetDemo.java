package CollectionsFrameWorks;

import java.util.HashSet;
public class HashSetDemo {
    static void main() {
        HashSet<Integer> set = new HashSet<>();

        //add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println(set);

        //Contains()
        System.out.println("Contains 20?" + set.contains(20));

        //remove()
        System.out.println("Remove 20 =" + set.remove(20));

        //size()
        System.out.println("size of the set =" + set.size());
    }
}


/**
 * Doesnot allow duplicates
 * Doesnot maintains the order of insertion
 * Uses hashing internally
 * Very fast for add, remove, and search operations
 */