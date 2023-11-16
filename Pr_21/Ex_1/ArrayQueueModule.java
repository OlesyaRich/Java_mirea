package Pr_21.Ex_1;

public class ArrayQueueModule {
    private static int[] elements;
    private static int front;
    private static int rear;
    private static int size;
    private static int capacity;
    // Предусловие: capacity > 0
    // Постусловие: создана пустая очередь с заданным размером capacity
    public static void create(int capacity) {
        elements = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
        ArrayQueueModule.capacity = capacity;
    }
    // Предусловие: очередь не заполнена
    // Постусловие: элемент добавлен в конец очереди
    public static void enqueue(int element) {
        elements[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
    }
    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    public static int element() {
        return elements[front];
    }
    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    public static int dequeue() {
        int element = elements[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }
    // Постусловие: возвращен текущий размер очереди
    public static int size() {
        return size;
    }
    // Постусловие: возвращено true, если очередь пуста, иначе false
    public static boolean isEmpty() {
        return size == 0;
    }
    // Постусловие: очередь очищена
    public static void clear() {
        front = 0;
        rear = 0;
        size = 0;
    }
}
