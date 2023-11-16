package Pr_21.Ex_1;

public class ArrayQueueADT {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    // Предусловие: capacity > 0
    // Постусловие: создана пустая очередь с заданным размером capacity
    public static void create(ArrayQueueADT queue, int capacity) {
        queue.elements = new int[capacity];
        queue.front = 0;
        queue.rear = 0;
        queue.size = 0;
        queue.capacity = capacity;
    }
    // Предусловие: очередь не заполнена
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(ArrayQueueADT queue, int element) {
        queue.elements[queue.rear] = element;
        queue.rear = (queue.rear + 1) % queue.capacity;
        queue.size++;
    }
    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    public static int element(ArrayQueueADT queue) {
        return queue.elements[queue.front];
    }
    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    public static int dequeue(ArrayQueueADT queue) {
        int element = queue.elements[queue.front];
        queue.front = (queue.front + 1) % queue.capacity;
        queue.size--;
        return element;
    }
    // Постусловие: возвращен текущий размер очереди
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }
    // Постусловие: возвращено true, если очередь пуста, иначе false
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }
    // Постусловие: очередь очищена
    public static void clear(ArrayQueueADT queue) {
        queue.front = 0;
        queue.rear = 0;
        queue.size = 0;
    }
}