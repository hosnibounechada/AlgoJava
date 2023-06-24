package org.hb.bst;

import java.util.Objects;

public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> right;
    private Node<T> left;

    public Node(T data) {
        this.data = data;
        right = null;
        left = null;
    }

    public void insert(T data) {
        if (data.compareTo(this.data) < 0) {
            if (left != null) {
                left.insert(data);
            } else {
                left = new Node<>(data);
            }
        } else if (data.compareTo(this.data) > 0) {
            if (right != null) {
                right.insert(data);
            } else {
                right = new Node<>(data);
            }
        }
    }
    // Getter & Setters, ToString & Equal & HashCode

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", right=" + right +
                ", left=" + left +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) && Objects.equals(right, node.right) && Objects.equals(left, node.left);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, right, left);
    }
}
