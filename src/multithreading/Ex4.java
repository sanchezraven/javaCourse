package src.multithreading;

public class Ex4 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("myPotok");
        myThread5.setPriority(Thread.MIN_PRIORITY);
        System.out.println("name is " + myThread5.getName() + " priority " + myThread5.getPriority());
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("halo");
    }
}
