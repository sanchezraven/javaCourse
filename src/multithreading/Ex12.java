package src.multithreading;

public class Ex12 {

    static final Object lock = new Object();

    synchronized void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype call ends");
        }
    }

    void telegCall() {
        synchronized (lock) {
            System.out.println("teleg call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("teleg call ends");
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpTeleg());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpMobile implements Runnable{

    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImpSkype implements Runnable{

    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImpTeleg implements Runnable{

    @Override
    public void run() {
        new Ex12().telegCall();
    }
}