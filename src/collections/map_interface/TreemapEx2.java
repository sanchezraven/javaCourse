package src.collections.map_interface;

import java.util.TreeMap;

public class TreemapEx2 {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaza", "Kotov", 3);
        Student st2 = new Student("Ivan", "Sidorov", 2);
        Student st3 = new Student("Pavel", "Ivanov", 4);
        Student st4 = new Student("Zara", "Koprova", 3);
        Student st5 = new Student("Igor", "Sipkin", 2);
        Student st6 = new Student("Peta", "Ionova", 4);
        Student st7 = new Student("Posh", "Ibramov", 4);
        treeMap.put(st1, 5.8);
        treeMap.put(st2, 6.4);
        treeMap.put(st3, 9.1);
        treeMap.put(st4, 5.7);
        treeMap.put(st5, 9.2);
        treeMap.put(st6, 6.7);
        treeMap.put(st7, 3.4);
        System.out.println(treeMap);
    }
}
