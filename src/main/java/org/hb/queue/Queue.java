package org.hb.queue;

import org.hb.linkedlist.LinkedList;

public class Queue<T> {
    private final LinkedList<T> arrayList;
    private final int capacity;
    public Queue(int capacity) {
        this.capacity = capacity;
        arrayList = new LinkedList<>();
    }

    public void enqueue(T item){
        if(arrayList.getSize() == capacity) {
            return;
        }

        arrayList.add(item);
    }

    public T dequeue(){
        if(arrayList.getSize() == 0) {
            return null;
        }

        T item = arrayList.getFirst().getData();

        arrayList.removeFirst();

        return item;
    }
    public T peek(){
        if(arrayList.isEmpty()) return null;

        return arrayList.getFirst().getData();
    }
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    public int getSize(){
        return arrayList.getSize();
    }

    public LinkedList<T> getArrayList() {
        return arrayList;
    }
}
