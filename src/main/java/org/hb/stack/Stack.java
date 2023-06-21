package org.hb.stack;

public class Stack {
    private final int capacity;
    private int size;
    private final int[] stack;

    public Stack(int capacity) {
        this.capacity = capacity;
        size = 0;
        stack = new int[capacity];
    }

    public void push(int item) {
        if (size == capacity) return;

        stack[size] = item;

        size++;
    }

    public int pop() {
        if (size == 0) return 0;

        int item = stack[size - 1];

        stack[size - 1] = 0;

        size--;

        return item;
    }

    public int peek() {
        if (size == 0) return 0;

        return stack[size - 1];
    }

    public int[] getStack() {
        return stack;
    }

    public int getSize() {
        return size;
    }
}
