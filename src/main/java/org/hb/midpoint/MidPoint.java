package org.hb.midpoint;

import org.hb.linkedlist.LinkedList;
import org.hb.linkedlist.Node;

public class MidPoint<T> {
    // --- Directions
    // Return the 'middle' node of a linked list.
    // If the list has an even number of elements, return
    // the node at the end of the first half of the list.
    // *Do not* use a counter variable, *do not* retrieve
    // the size of the list, and only iterate
    // through the list one time.
    // --- Example
    //   const l = new LinkedList();
    //   l.insertLast('a')
    //   l.insertLast('b')
    //   l.insertLast('c')
    //   midpoint(l); // returns { data: 'b' }

    LinkedList<T> list;

    public MidPoint(LinkedList<T> list) {
        this.list = list;
    }

    public Node<T> midPointUsingSize() {

        if(list.getSize() == 0) return null;

        int mid = (list.getSize() - 1) / 2;

        return list.getAt(mid);
    }

    public Node<T> midPointUsingIteration() {

        Node<T> first = list.getFirst();

        if(first == null) return null;

        Node<T> fast = first;
        Node<T> slow = fast;

        while(fast.getNext() != null && fast.getNext().getNext() != null){
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }
}
