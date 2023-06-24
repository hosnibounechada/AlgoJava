package org.hb.tree;

import java.util.*;

public class Tree<T> {
    // --- Directions
    // 1) Create a node class.  The constructor
    // should accept an argument that gets assigned
    // to the data property and initialize an
    // empty array for storing children. The node
    // class should have methods 'add' and 'remove'.
    // 2) Create a tree class. The tree constructor
    // should initialize a 'root' property to null.
    // 3) Implement 'traverseBF' and 'traverseDF'
    // on the tree class.  Each method should accept a
    // function that gets called with each element in the tree

    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    public void traverseBF() {
        Queue<Node<T>> queue = new ArrayDeque<>();

        if (root == null) return;

        queue.add(root);

        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {
            Node<T> node = queue.poll();

            sb.append(node.getData()).append(" -> ");

            queue.addAll(node.getChildren());
        }
        sb.append("null");

        System.out.println(new String(sb));
    }

    public void traverseDF() {
        Stack<Node<T>> stack = new Stack<>();

        if (root == null) return;

        stack.add(root);

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()){
            Node<T> node = stack.pop();

            sb.append(node.getData()).append(" -> ");

            Stack<Node<T>> temp = new Stack<>();

            temp.addAll(node.getChildren());

            while(!temp.isEmpty()){
                stack.add(temp.pop());
            }
        }
        sb.append("null");

        System.out.println(new String(sb));
    }

    // Getters, Setters, ToString, Equals & HashCode

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree<?> tree = (Tree<?>) o;
        return Objects.equals(root, tree.root);
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }
}
