package HashMap;

import java.util.HashMap;

public class HashMaps {
    static void main() {
        HashMap<Integer,String> map  = new HashMap<>();

        //put()
        map.put(1, "MONKEY D LUFFY");
        map.put(2, "RORO NOVA ZORA");
        map.put(3, "BLACK LEG SANJI");
        map.put(4, "CAT BURGLER NAMI");
        map.put(5, "SNIPPER KING USSOP");
        map.put(6, "NICO ROBIN");
        map.put(7, "TONY TONY CHOPPER");
        map.put(8, "CYBORGE FRANKY");
        map.put(9, "GIMBE(FISHMAN)");

        // display hashmaps
        System.out.println("Straw Hats : " + map);

        // get() - access value
        System.out.println("Navigator of the Crew : " + map.get(4));

        // containsKey()
        System.out.println("Contains key 3? " + map.containsKey(3));

        // remove()
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // size()
        System.out.println("Size of map: " + map.size());
    }
}
