package src.collections.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreesetEx1 {
    public static void main(String[] args) {
        Set<Integer> treeset = new TreeSet<>();
        treeset.add(6);
        treeset.add(8);
        treeset.add(1);
        treeset.add(2);
        treeset.add(33);
        System.out.println(treeset);
        System.out.println(treeset.contains(2));
    }
}
