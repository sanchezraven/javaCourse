package src.generics;

public class ParamClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("priv", 66);
        System.out.println("Znach value1 = " + pair1.getFirstValue() +
                ", value2= " + pair1.getSecondValue());

        OtherPair<String> otherPair1 = new OtherPair<>("1" , "2");
    }
}

class Pair <V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair <V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
