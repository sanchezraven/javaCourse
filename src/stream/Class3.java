package src.stream;

import java.util.Arrays;

public class Class3 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 6};
        Arrays.stream(arr).forEach(e -> {
            e*=2;
            System.out.println(e);
        });
        Arrays.stream(arr).forEach(System.out::println);
        Arrays.stream(arr).forEach(Utils::method);
    }
}

class Utils {
    public static void method(int a) {
        a = a + 5;
        System.out.println("el = " + a);
    }
}
