package src.generics;

import java.util.ArrayList;

public class PararmMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(13);
        al1.add(12);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
        ArrayList<String> al2 =  new ArrayList<>();
        al2.add("priv");
        al2.add("poka");
        al2.add("hi");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);

    }
}

class GenMethod {
    public static <T> T getSecondElement (ArrayList<T> al) {
        return al.get(1);
    }
}
