package org.hb.qfroms;

import org.hb.stack.Stack;

public class QFromS {
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
    private final Stack stackOne;
    private final Stack stackTwo;

    public QFromS(int capacity) {
        this.capacity = capacity;
        this.stackOne = new Stack(capacity);
        this.stackTwo = new Stack(capacity);
    }

    public void add(int item) {
        if (stackTwo.getSize() == capacity) return;

        stackOne.push(item);
    }

    public int remove() {
        if (stackOne.getSize() == 0) return 0;

        while (stackOne.peek() != 0) {
            stackTwo.push(stackOne.pop());
        }

        int item = stackTwo.pop();

        while (stackTwo.peek() != 0) {
            stackOne.push(stackTwo.pop());
        }

        return item;
    }

    public int peek() {
        if (stackOne.getSize() == 0) return 0;

        while (stackOne.peek() != 0) {
            stackTwo.push(stackOne.pop());
        }

        int item = stackTwo.peek();

        while (stackTwo.peek() != 0) {
            stackOne.push(stackTwo.pop());
        }

        return item;
    }

}
