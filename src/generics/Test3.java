package src.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List <?> list = new ArrayList<>();

        List<? extends Number> list30 = new ArrayList<Integer>();

        List <Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        List <String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("poka");
        list2.add("halo");
        showListInfo(list2);

        ArrayList<Double> alD = new ArrayList<>();
        alD.add(3.14);
        alD.add(3.15);
        alD.add(3.16);
        System.out.println(sum(alD));
    }

    static void showListInfo(List<?> list) {
        System.out.println("list have elements: " + list);
    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for(Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }
}
