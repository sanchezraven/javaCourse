package src.nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Plus implements Math2{
            @Override
            public int doOperarion(int a, int b) {
                return a+b;
            }
        }

        Plus plus = new Plus();
        System.out.println(plus.doOperarion(1,3));
    }
}

interface Math2 {
    int doOperarion(int a, int b);
}
