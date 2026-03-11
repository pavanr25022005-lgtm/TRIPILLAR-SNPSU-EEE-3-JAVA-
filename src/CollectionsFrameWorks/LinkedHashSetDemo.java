package CollectionsFrameWorks;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);   // duplicate (will not be added)

        System.out.println(set);

        // contains()
        System.out.println("Contains 20? " + set.contains(20));

        // remove()
        System.out.println("Remove 20 = " + set.remove(20));

        // size()
        System.out.println("Size of the set = " + set.size());
    }
}
