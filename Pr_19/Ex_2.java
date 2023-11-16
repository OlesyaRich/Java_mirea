package Pr_19;

public class Ex_2<T> {
    private T[] array;
    public Ex_2(T[] array) {
        this.array = array;
    }
    public T getElement(int index) {
        return array[index];
    }
}