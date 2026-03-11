package CollectionsFrameWorks;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // put() - add elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        // display hashmap
        System.out.println("HashMap elements: " + map);

        // get() - access value
        System.out.println("Value at key 2: " + map.get(2));

        // containsKey()
        System.out.println("Contains key 3? " + map.containsKey(3));

        // remove()
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // size()
        System.out.println("Size of map: " + map.size());
    }
}