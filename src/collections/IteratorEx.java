package src.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("masha");
        arrayList1.add("igor");
        arrayList1.add("vasya");

        Iterator<String> iterator = arrayList1.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
