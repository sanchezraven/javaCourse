package src.collections.map_interface;

import java.util.TreeMap;

public class TreemapEx {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaza", "Kotov", 3);
        Student st2 = new Student("Ivan", "Sidorov", 2);
        Student st3 = new Student("Pavel", "Ivanov", 4);
        Student st4 = new Student("Zara", "Koprova", 3);
        Student st5 = new Student("Igor", "Sipkin", 2);
        Student st6 = new Student("Peta", "Ionova", 4);
        Student st7 = new Student("Posh", "Ibramov", 4);
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(9.1, st3);
        treeMap.put(5.7, st4);
        treeMap.put(9.2, st5);
        treeMap.put(6.7, st6);
        treeMap.put(3.4, st7);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(7.0));
        System.out.println(treeMap.headMap(7.0));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
    }

}
