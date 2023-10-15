package src.collections.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashsetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zova");
        set.add("OLeg");
        set.add("Marina");
        set.add("Igor");
        set.add(null);
        set.remove(null);

        System.out.println(set);
        System.out.println(set.contains("Igo"));
        for (String s : set) {
            System.out.println(s);
        }
    }
}
