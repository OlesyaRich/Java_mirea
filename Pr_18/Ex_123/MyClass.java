package Pr_18.Ex_123;
import Pr_18.Ex_123.Animal;

import java.io.Serializable;

public class MyClass<T extends Comparable, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getVariable1() {
        return t;
    }
    public V getVariable2() {
        return v;
    }
    public K getVariable3() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Variable 1 class: " + t.getClass().getSimpleName());
        System.out.println("Variable 2 class: " + v.getClass().getSimpleName());
        System.out.println("Variable 3 class: " + k.getClass().getSimpleName());
    }
}