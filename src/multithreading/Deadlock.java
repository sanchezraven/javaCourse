package src.multithreading;

public class Deadlock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: Try to take monitor lock1");
        synchronized (Deadlock.lock1) {
            System.out.println("Thread10: Monitor lock1 taken");

            System.out.println("Thread10: Try to take monitor lock2");
            synchronized (Deadlock.lock2) {
                System.out.println("Thread10: Monitor's lock1 nad lock2  taken");
            }
        }
    }
}

class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: Try to take monitor lock2");
        synchronized (Deadlock.lock2) {
            System.out.println("Thread20: Monitor lock2 taken");

            System.out.println("Thread20: Try to take monitor lock1");
            synchronized (Deadlock.lock1) {
                System.out.println("Thread20: Monitor's lock1 nad lock2  taken");
            }
        }
    }
}