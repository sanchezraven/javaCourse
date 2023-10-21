package src.nested_classes.anonymous_classes;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperarion(int a, int b) {
                return a+b;
            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperarion(int a, int b) {
                return a*b;
            }
        };
        System.out.println(m.doOperarion(3,1));
        System.out.println(m2.doOperarion(3,1));
    }
}

interface Math {
    int doOperarion(int a, int b);
}