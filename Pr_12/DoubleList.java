package Pr_12;
import java.util.Scanner;

class DoubleList {
    private Node head;
    private Node tail;
    private int size;

    public DoubleList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        int data = head.getData();
        head = head.getNext();
        if (head == null) {
            tail = null;
        } else {
            head.setPrev(null);
        }
        size--;
        return data;
    }

    public int removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        int data = tail.getData();
        tail = tail.getPrev();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        size--;
        return data;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    private class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }

        public int getData() {
            return data;
        }

        public void setPrev(Node node) {
            prev = node;
        }

        public Node getPrev() {
            return prev;
        }

        public void setNext(Node node) {
            next = node;
        }

        public Node getNext() {
            return next;
        }
    }
}