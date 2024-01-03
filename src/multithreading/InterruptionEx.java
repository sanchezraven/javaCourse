package src.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(2000);
        interruptedThread.interrupt();
        interruptedThread.join();
        System.out.println("main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrt = 0;
    @Override
    public void run() {
        for (int i = 1; i <= 1000000000; i++) {
            if(isInterrupted()) {
                System.out.println("tread want to interrupted");
                System.out.println("statement all threads is ok, decided to finish thread");
                return;
            }
            sqrt += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("thread to be wanted interrupt while sleeping");
                return;
            }
        }
        System.out.println(sqrt);
    }
}