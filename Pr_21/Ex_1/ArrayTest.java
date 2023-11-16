package Pr_21.Ex_1;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("Примеры использования класса ArrayQueue:");
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.size()); // выводит 3
        System.out.println(queue.element()); // выводит 1
        System.out.println(queue.dequeue()); // выводит 1
        System.out.println(queue.size()); // выводит 2
        queue.clear();
        System.out.println(queue.isEmpty()); // выводит true

        System.out.println("\nПримеры использования класса ArrayQueueADT:");
        ArrayQueueADT queue1 = new ArrayQueueADT();
        ArrayQueueADT.create(queue1, 5);
        ArrayQueueADT.enqueue(queue1, 1);
        ArrayQueueADT.enqueue(queue1, 2);
        ArrayQueueADT.enqueue(queue1, 3);
        System.out.println(ArrayQueueADT.size(queue1)); // выводит 3
        System.out.println(ArrayQueueADT.element(queue1)); // выводит 1
        System.out.println(ArrayQueueADT.dequeue(queue1)); // выводит 1
        System.out.println(ArrayQueueADT.size(queue1)); // выводит 2
        ArrayQueueADT.clear(queue1);
        System.out.println(ArrayQueueADT.isEmpty(queue1)); // выводит true

        System.out.println("\nПримеры использования класса ArrayQueueModule:");
        ArrayQueueModule.create(5);
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);
        System.out.println(ArrayQueueModule.size()); // выводит 3
        System.out.println(ArrayQueueModule.element()); // выводит 1
        System.out.println(ArrayQueueModule.dequeue()); // выводит 1
        System.out.println(ArrayQueueModule.size()); // выводит 2
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // выводит true
    }
}
