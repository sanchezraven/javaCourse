package src.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callbox = new Semaphore(2);
        new Person("Zaza", callbox);
        new Person("Oudrey", callbox);
        new Person("Nata", callbox);
        new Person("Kola", callbox);
        new Person("Ola", callbox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting");
            callBox.acquire();
            System.out.println(name + " using phone");
            Thread.sleep(2000);
            System.out.println(name + " finished call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}