package Pr_21.Ex_2;

public class QueueTest {
    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        queue.enqueue("Hello");
        queue.enqueue("World");
        System.out.println(queue.size()); // выводит 2
        System.out.println(queue.element()); // выводит "Hello"
        System.out.println(queue.dequeue()); // выводит "Hello"
        System.out.println(queue.size()); // выводит 1
        queue.clear();
        System.out.println(queue.isEmpty()); // выводит true
    }
}
