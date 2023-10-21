package src.nested_classes.inner_class;

public class Car {
    String color;
    int door;
    Engine engine;

    public Car(String color, int door) {
        this.color = color;
        this.door = door;
        //this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
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

    public class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(300);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        Car.Engine engine3 = new Car("yellow", 4).new Engine(200);
    }
}