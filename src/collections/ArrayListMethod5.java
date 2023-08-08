package src.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("masha");
        arrayList1.add("igor");
        arrayList1.add("vasya");
        System.out.println("ArrayList = " + arrayList1);
        Object[] array = arrayList1.toArray();
        String[] array2 = arrayList1.toArray(new String[0]);
        for (String s : array2) {
            System.out.println(s);
        }

        List<Integer> list1 = List.of(3, 6, 4);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
    }

}
