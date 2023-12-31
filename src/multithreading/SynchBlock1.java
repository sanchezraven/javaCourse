package src.multithreading;

public class SynchBlock1 {
    public static void main(String[] args) {
        MyRunnableEx2 runnable = new MyRunnableEx2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnableEx2 implements Runnable {

    public void doWork1() {
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
