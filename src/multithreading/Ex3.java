package src.multithreading;

public class Ex3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hi");
            }
        }).start();

        new Thread(() -> System.out.println("halo")).start();
    }
}
