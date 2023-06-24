package org.hb.validate;

import org.hb.bst.Node;

public class Validate {
    // --- Directions
    // Given a node, validate the binary search tree,
    // ensuring that every node's left hand child is
    // less than the parent node's value, and that
    // every node's right hand child is greater than
    // the parent
    public <T extends Comparable<T>> boolean validate(Node<T> node) {
        return validate(node, null, null);
    }

    public <T extends Comparable<T>> boolean validate(Node<T> node, T min, T max) {
        if(max != null && node.getData().compareTo(max) > 0) return false;

        if(min != null && node.getData().compareTo(min) < 0) return false;

        if(node.getLeft() != null && !validate(node.getLeft(), min, node.getData())) return false;

        if(node.getRight() != null && !validate(node.getRight(), node.getData(), max)) return false;

        return true;
    }
}
