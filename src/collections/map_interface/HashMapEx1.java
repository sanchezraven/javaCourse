package src.collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "ivan T");
        map1.put(3643, "maria Z");
        map1.put(5856, "Oleg B");
        map1.put(124, "bill K");
        map1.put(null, null);
        map1.putIfAbsent(124, "billaz Klinton");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(1245);
        System.out.println(map1);
        System.out.println(map1.containsValue("bill K"));
        System.out.println(map1.containsKey(124));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
