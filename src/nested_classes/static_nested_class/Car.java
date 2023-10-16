package src.nested_classes.static_nested_class;

public class Car {
    String color;
    int door;
    Engine engine;
    private static int a;

    public Car(String color, int door, Engine engine) {
        this.color = color;
        this.door = door;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }

    void method() {
        System.out.println(Engine.countCil);
        Engine e = new Engine(80);
        System.out.println(e.horsePower);
    }

    public static class Engine {
        private int horsePower;
        static int countCil;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(a);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);

        Car car = new Car("red", 2, engine);
        System.out.println(car);
    }
}
