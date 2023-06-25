package src.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Zal");
        list.add("Ivan");
        list.add("Maria");
        System.out.println("before sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("after sort");
        System.out.println(list);
    }
}
