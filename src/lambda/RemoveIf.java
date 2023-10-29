package src.lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("halo");
        al.add("bye");
        al.add("tschuse");
        al.add("arrevoir");
        al.add("aufvieder");
        al.removeIf(el -> el.length() < 5);
        System.out.println(al);
    }
}
