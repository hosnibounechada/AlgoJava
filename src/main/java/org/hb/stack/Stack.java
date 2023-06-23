package org.hb.stack;

import org.hb.linkedlist.LinkedList;

public class Stack<T> {
    private final int capacity;
    private final LinkedList<T> arrayList;

    public Stack(int capacity) {
        this.capacity = capacity;
        arrayList = new LinkedList<>();
    }

    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    public void push(T item) {
        if (arrayList.getSize() == capacity) return;

        arrayList.add(item);
    }

    public T pop() {
        if (arrayList.isEmpty()) return null;

        T item = arrayList.getLast().getData();

        arrayList.removeLast();

        return item;
    }

    public T peek() {
        if (arrayList.isEmpty()) return null;

        return arrayList.getLast().getData();
    }

    public LinkedList<T> getArrayList() {
        return arrayList;
    }

    public int getSize() {
        return arrayList.getSize();
    }
}
