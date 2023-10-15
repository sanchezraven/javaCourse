package src.collections.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zara");
        queue.add("Oleg");
        queue.add("Gena");
        queue.add("Maria");
        queue.add("Tanya");
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
