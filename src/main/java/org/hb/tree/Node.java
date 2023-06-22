package org.hb.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Node<T> {
    private final T data;
    private List<Node<T>> children;

    public Node(T data){
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void add(T data){
        children.add(new Node<>(data));
    }

    public void remove(T data){
        children = children.stream().filter((node) -> !node.data.equals(data)).toList();
    }

    // Getters, Setters, ToString, Equals & HashCode

    public T getData() {
        return data;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", children=" + children +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(data, node.data) && Objects.equals(children, node.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, children);
    }
}
