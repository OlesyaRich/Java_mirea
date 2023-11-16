package Pr_21.Ex_2;

// Интерфейс Queue:
// - enqueue(element) - добавить элемент в конец очереди
// - element() - получить первый элемент очереди без удаления
// - dequeue() - удалить и вернуть первый элемент очереди
// - size() - текущий размер очереди
// - isEmpty() - является ли очередь пустой
// - clear() - удалить все элементы из очереди

public class LinkedQueue<E> implements Queue<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // Предусловие: -
    // Постусловие: создана пустая очередь
    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Предусловие: -
    // Постусловие: элемент добавлен в конец очереди
    public void enqueue(E element) {
        Node<E> node = new Node<>(element);
        if (isEmpty()) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    public E element() {
        return head.element;
    }

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    public E dequeue() {
        E element = head.element;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
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
        head = null;
        tail = null;
        size = 0;
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element) {
            this.element = element;
            this.next = null;
        }
    }
}
