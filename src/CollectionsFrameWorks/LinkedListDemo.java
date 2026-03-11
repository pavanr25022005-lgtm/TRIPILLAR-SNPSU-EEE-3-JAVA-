package CollectionsFrameWorks;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println("List are = " + list);

        // get()
        System.out.println("Element at Index 1 = " + list.get(1));

        // size()
        System.out.println("Size = " + list.size());

        // contains()
        System.out.println("Contains = " + list.contains(30));

        // remove()
        list.remove(2);
        System.out.println("After Removing Index 2 = " + list);
    }
}
