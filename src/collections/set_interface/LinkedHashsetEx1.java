package src.collections.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashsetEx1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lsh = new LinkedHashSet<>();
        lsh.add(5);
        lsh.add(12);
        lsh.add(2);
        lsh.add(9);
        lsh.add(6);
        System.out.println(lsh);
        lsh.remove(6);
        System.out.println(lsh);
    }
}
