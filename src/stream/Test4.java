package src.stream;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(0);
        list.add(8);

        int result = list.stream().reduce( (accumulator, el) ->
                accumulator*el).get();
        System.out.println(result);

        int result2 = list.stream().reduce(1, (accumulator, el) ->
                accumulator*el);
        System.out.println(result2);
    }
}
