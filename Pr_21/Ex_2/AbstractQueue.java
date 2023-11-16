package Pr_21.Ex_2;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size;

    // Предусловие: -
    // Постусловие: создана пустая очередь
    public AbstractQueue() {
        this.size = 0;
    }

    // Предусловие: -
    // Постусловие: элемент добавлен в конец очереди
    public abstract void enqueue(E element);

    // Предусловие: очередь не пуста
    // Постусловие: возвращен первый элемент очереди
    public abstract E element();

    // Предусловие: очередь не пуста
    // Постусловие: удален и возвращен первый элемент очереди
    public abstract E dequeue();

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
        while (!isEmpty()) {
            dequeue();
        }
    }
}