package src.multithreading;

public class Ex7 {
    public static void main(String[] args) {
        MyRunnableEx1 myRunnableEx1 = new MyRunnableEx1();
        Thread thread1 = new Thread(myRunnableEx1);
        Thread thread2 = new Thread(myRunnableEx1);
        Thread thread3 = new Thread(myRunnableEx1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnableEx1 implements Runnable {

    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
                increment();
        }
    }
}
