package src.stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,324,54,6,8,3,435};
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));

    }
}
