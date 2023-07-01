package org.hb.addtwonumbers;

import org.hb.linkedlist.LinkedList;
import org.hb.linkedlist.Node;

public class AddTwoNumbers {
    //    Directions
    //    You are given two non-empty linked lists representing two non-negative integers.
    //    The digits ae sored in reverse order and each of their nodes contain a single
    //    digit. Add the two numbers and return it as a linked list. |
    //    You may assume the two numbers do not contain any leading zero, except the
    //    number 0 set.
    //    Example:
    //    input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    //    output: 7 -> 0 -> 8
    //    Explanation: 342 + 465 = 807.

    public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){
        LinkedList<Integer> result = new LinkedList<>();

        Node<Integer> p1 = l1.getFirst();
        Node<Integer> p2 = l2.getFirst();

        int carry = 0;

        while (p1 != null || p2 != null) {
            int sum = carry;
            if (p1 != null) {
                sum += p1.getData();
                p1 = p1.getNext();
            }
            if (p2 != null) {
                sum += p2.getData();
                p2 = p2.getNext();
            }
            carry = sum / 10;
            result.add(sum % 10);
        }

        if (carry != 0) {
            result.add(carry);
        }

        return result;
    }
}
