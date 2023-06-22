package org.hb.fromlast;

import org.hb.linkedlist.LinkedList;
import org.hb.linkedlist.Node;

public class FromLast<T> {
    // --- Directions
    // Given a linked list, return the element n spaces
    // from the last node in the list.  Do not call the 'size'
    // method of the linked list.  Assume that n will always
    // be less than the length of the list.
    // --- Examples
    //    const list = new List();
    //    list.insertLast('a');
    //    list.insertLast('b');
    //    list.insertLast('c');
    //    list.insertLast('d');
    //    fromLast(list, 2).data // 'b'

    private final LinkedList<T> list;

    public FromLast(LinkedList<T> list) {
        this.list = list;
    }

    public Node<T> fromLast(int n) {
        Node<T> first = list.getFirst();

        if (first == null) return null;

        Node<T> fast = first;
        Node<T> slow = first;

        while (n != 0) {
            fast = fast.getNext();
            n--;
        }

        while (fast.getNext() != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }

        return slow;
    }
}
