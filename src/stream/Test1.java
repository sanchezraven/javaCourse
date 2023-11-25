package src.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("halo");
        list.add("ok");
        list.add("bye");
        list.add("whazup");

        List<Integer> list2 = list.stream().map(el -> el.length())
                .collect(Collectors.toList());

        System.out.println(list2);

        int[] array = {5, 3, 9, 6};
        array = Arrays.stream(array).map(el -> {
            if (el%3 == 0) {
                el = el/3;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("halo");
        set.add("ok");
        set.add("bye");
        set.add("whazup");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);
    }
}
