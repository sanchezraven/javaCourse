package src.generics;

public class ParamClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("priv");
        System.out.println(info1);

        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(1);
        System.out.println(info2);
        Integer i1 = info2.getValue();
    }

    /* у jvm стираются jenerics, и методы одинаковые
    public void abc (Info<String> info) {
        String s = info.getValue();
    }
    public void abc (Info<Integer> info) {
        Integer i = info.getValue();
    }
    */
}

class Info <T> {
    private T value;
    public Info(T value) {
        this.value = value;
    }
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
/* нельзя переопределить type erasure
class Parent {
    public void abc (Info<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent {
    public void abc (Info<Integer> info) {
        Integer s = info.getValue();
    }
}

 */