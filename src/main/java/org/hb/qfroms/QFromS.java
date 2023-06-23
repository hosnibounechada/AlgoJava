package org.hb.qfroms;

import org.hb.stack.Stack;

public class QFromS<T> {
    // --- Directions
    // Implement a Queue datastructures using two stacks.
    // *Do not* create an array inside the 'Queue' class.
    // Queue should implement the methods 'add', 'remove', and 'peek'.
    // For a reminder on what each method does, look back
    // at the Queue exercise.
    // --- Examples
    //     const q = new Queue();
    //     q.add(1);
    //     q.add(2);
    //     q.peek();  // returns 1
    //     q.remove(); // returns 1
    //     q.remove(); // returns 2
    private final int capacity;
    private final Stack<T> stackOne;
    private final Stack<T> stackTwo;

    public QFromS(int capacity) {
        this.capacity = capacity;
        this.stackOne = new Stack<>(capacity);
        this.stackTwo = new Stack<>(capacity);
    }

    public void add(T item) {
        if (stackTwo.getSize() == capacity) return;

        stackOne.push(item);
    }

    public T remove() {
        if (stackOne.isEmpty()) return null;

        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }

        T item = stackTwo.pop();

        while (!stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }

        return item;
    }

    public T peek() {
        if (stackOne.getSize() == 0) return null;

        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }

        T item = stackTwo.peek();

        while (stackTwo.isEmpty()) {
            stackOne.push(stackTwo.pop());
        }

        return item;
    }

}
