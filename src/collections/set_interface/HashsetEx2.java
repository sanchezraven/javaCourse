package src.collections.set_interface;

import java.util.HashSet;

public class HashsetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(5);
        hs1.add(7);
        hs1.add(10);
        hs1.add(2);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(5);
        hs2.add(3);
        hs2.add(10);
        hs2.add(8);

        HashSet<Integer> union = new HashSet<>(hs1);
        union.addAll(hs2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hs1);
        intersect.retainAll(hs2);
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hs1);
        subtract.removeAll(hs2);
        System.out.println(subtract);
    }
}
