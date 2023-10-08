package src.collections.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashmapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>();
        Student st1 = new Student("Zaza", "Kotov", 3);
        Student st2 = new Student("Ivan", "Sidorov", 2);
        Student st3 = new Student("Pavel", "Ivanov", 4);
        Student st4 = new Student("Zara", "Koprova", 3);
        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(9.1, st3);
        lhm.put(5.7, st4);

        System.out.println(lhm);
    }

}
