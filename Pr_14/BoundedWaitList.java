package Pr_14;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E> {

    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
        content = new ConcurrentLinkedQueue<E>();
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void add(E element) {
        if (content.size() < capacity) {
            content.add(element);
        }
    }
    public String toString() {
        return "BoundedWaitList with capacity " + capacity + ": " + content.toString();
    }
}