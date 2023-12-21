package src.multithreading;

public class Ex6 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());

        System.out.println("main ends");
    }
}

class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("work begins");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work ends");
    }
}
