package org.hb.queue;

public class Queue {
    private final int[] arrayQueue;
    private final int capacity;
    private int size;
    public Queue(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        arrayQueue = new int[capacity];
    }

    public void enqueue(int item){
        if(size == capacity) {
            return;
        }
        for(int i = size; i > 0; i--){
            arrayQueue[i] = arrayQueue[i - 1];
        }
        arrayQueue[0] = item;
        size++;
    }

    public int dequeue(){
        if(size == 0) {
            return -1;
        }
        int item = arrayQueue[size - 1];
        arrayQueue[size - 1] = 0;
        size--;
        return item;
    }
    public int peek(){
        if(size == 0) return 0;
        return arrayQueue[size - 1];
    }
    public int getSize(){
        return size;
    }

    public int[] getArrayQueue(){
        return arrayQueue;
    }
}
