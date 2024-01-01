package src.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Atm {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Zaza", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        new Employee("Vika", lock);
        new Employee("Masha", lock);
    }


}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting");
            lock.lock();
            System.out.println(name + " is working with ATM");
            Thread.sleep(2000);
            System.out.println(name + " is finished with ATM");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
