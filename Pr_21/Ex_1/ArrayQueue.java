package Pr_21.Ex_1;

// Инвариант: элементы очереди хранятся в массиве elements с индексами от front до rear-1.
// Если очередь пуста, то front = rear.
// Если очередь заполнена, то rear указывает на следующий за последним элементом индекс, а front - на первый элемент.
// Размер очереди не превышает capacity.
public class ArrayQueue {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    // Предусловие: capacity > 0
    // Постусловие: создана пустая очередь с заданным размером capacity
    public ArrayQueue(int capacity) {
        this.elements = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.capacity = capacity;
    }
    // Предусловие: очередь не заполнена
    // Постусловие: элемент добавлен в конец очереди
    public void enqueue(int element) {
        elements[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
    }
    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    public int element() {
        return elements[front];
    }
    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    public int dequeue() {
        int element = elements[front];
        front = (front + 1) % capacity;
        size--;
        return element;
    }
    // Постусловие: возвращен текущий размер очереди
    public int size() {
        return size;
    }
    // Постусловие: возвращено true, если очередь пуста, иначе false
    public boolean isEmpty() {
        return size == 0;
    }
    // Постусловие: очередь очищена
    public void clear() {
        front = 0;
        rear = 0;
        size = 0;
    }
}
