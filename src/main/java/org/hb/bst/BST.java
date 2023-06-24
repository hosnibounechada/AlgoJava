package org.hb.bst;

public class BST {
    public <T extends Comparable<T>> boolean search(T data, Node<T> root) {
        if (data.compareTo(root.getData()) == 0) {
            return true;
        } else if (data.compareTo(root.getData()) < 0) {
            if (root.getLeft() == null) return false;

            return search(data, root.getLeft());
        } else if (data.compareTo(root.getData()) > 0) {
            if (root.getRight() == null) return false;

            return search(data, root.getRight());
        }
        return false;
    }
}
