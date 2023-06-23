package org.hb.linkedlist;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LinkedList<T> implements Iterable<T> {
    // --- Directions
    // Implement classes Node and Linked Lists
    // See 'directions' document

    private Node<T> head;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T data) {
        insertLast(data);
    }

    public void printList() {
        Node<T> current = head;
        StringBuilder sb = new StringBuilder();

        while (current != null) {
            sb.append(current.getData()).append(" -> ");

            current = current.getNext();
        }
        sb.append("null");

        System.out.println(new String(sb));
    }


    public Node<T> getFirst() {
        return getAt(0);
    }

    public Node<T> getLast() {
        return getAt(size - 1);
    }

    public void clear() {
        head = null;

        size = 0;
    }

    public void insertFirst(T data) {
        Node<T> node = new Node<>(data);

        insertAt(0, node);
    }

    public void insertLast(T data) {
        Node<T> node = new Node<>(data);
        insertAt(size, node);
    }

    public void removeFirst() {
        removeAt(0);
    }

    public void removeLast() {
        removeAt(size - 1);
    }

    public Node<T> getAt(int index) {
        if (head == null) return null;

        int counter = 0;
        Node<T> node = head;

        while (node != null) {
            if (counter == index) return node;

            counter++;

            node = node.getNext();
        }
        return null;
    }

    public void insertAfter(Node<T> newNode, Node<T> node) {

        if (node == null || newNode == null) return;

        newNode.setNext(node.getNext());

        node.setNext(newNode);

        size++;
    }

    public void insertAt(int index, Node<T> node) {
        if (head == null) {
            head = node;
            size++;
            return;
        }

        if (index == 0) {
            node.setNext(head);
            head = node;
            size++;
            return;
        }

        Node<T> prevNode = getAt(index - 1);

        if (prevNode == null) {
            prevNode = getLast();
        }

        node.setNext(prevNode.getNext());

        prevNode.setNext(node);

        size++;
    }

    public void removeAt(int index) {
        if (head == null || size == 0) return;

        if (index == 0) {
            head = head.getNext();
            size--;
            return;
        }

        Node<T> prevNode = getAt(index - 1);

        if (prevNode == null || prevNode.getNext() == null) return;

        prevNode.setNext(prevNode.getNext().getNext());

        size--;
    }

    public void forEachItem(Consumer<Node<T>> action) {
        iterate((node, index) -> action.accept(node));
    }

    public void forEachItem(BiConsumer<Node<T>, Integer> action) {
        iterate(action);
    }

    private void iterate(BiConsumer<Node<T>, Integer> action) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            action.accept(current, index);
            current = current.getNext();
            index++;
        }
    }


    @SuppressWarnings("unchecked")
    public T[] toArray() {
        T[] array = (T[]) Array.newInstance(head.getData().getClass(), size);

        Node<T> current = head;

        int counter = 0;

        while (current != null) {
            array[counter++] = current.getData();

            current = current.getNext();
        }

        return array;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current;

        public LinkedListIterator() {
            current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.getData();
            current = current.getNext();
            return data;
        }
    }
}
