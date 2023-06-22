package org.hb.circular;

import org.hb.linkedlist.LinkedList;
import org.hb.linkedlist.Node;

public class Circular<T> {
    // --- Directions
    // Given a linked list, return true if the list
    // is circular, false if it is not.
    // --- Examples
    //   const l = new List();
    //   const a = new Node('a');
    //   const b = new Node('b');
    //   const c = new Node('c');
    //   l.head = a;
    //   a.next = b;
    //   b.next = c;
    //   c.next = b;
    //   circular(l) // true

    LinkedList<T> list;
    public Circular(LinkedList<T> list){
        this.list = list;
    }

    public boolean isCircular(){
        Node<T> first = list.getFirst();

        if(first == null) return false;

        Node<T> slow = first;
        Node<T> fast = first;

        while(fast.getNext() != null && fast.getNext().getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if(slow == fast) return true;
        }

        return false;
    }
}