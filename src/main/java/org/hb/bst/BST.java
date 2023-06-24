package org.hb.bst;

public class BST {
    // --- Directions
    // 1) Implement the Node class to create
    // a binary search tree.  The constructor
    // should initialize values 'data', 'left',
    // and 'right'.
    // 2) Implement the 'insert' method for the
    // Node class.  Insert should accept an argument
    // 'data', then create an insert a new node
    // at the appropriate location in the tree.
    // 3) Implement the 'contains' method for the BTS
    // class.  Contains should accept a 'data' argument
    // and return the Node in the tree with the same value.

    public <T extends Comparable<T>> Node<T> contains(T data, Node<T> node) {
        if (data.compareTo(node.getData()) == 0) {
            return node;
        } else if (data.compareTo(node.getData()) < 0) {
            if (node.getLeft() == null) return null;

            return contains(data, node.getLeft());
        } else if (data.compareTo(node.getData()) > 0) {
            if (node.getRight() == null) return null;

            return contains(data, node.getRight());
        }
        return null;
    }
}
