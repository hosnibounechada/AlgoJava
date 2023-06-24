package org.hb.levelwidth;

import org.hb.linkedlist.LinkedList;
import org.hb.queue.Queue;
import org.hb.tree.Node;

import java.util.Arrays;

public class LevelWidth<T> {
    public int[] levelWidth(Node<T> root) {

        if (root == null) return null;

        Queue<Node<T>> queue = new Queue<>(50);
        queue.enqueue(root);

        LinkedList<Integer> counters = new LinkedList<>();
        counters.add(0);
        int counter = 0;

        queue.enqueue(new Node<>(null));

        while (!queue.isEmpty()) {
            Node<T> node = queue.dequeue();

            if (queue.isEmpty()) {
                return Arrays.stream(counters.toArray())
                        .mapToInt(Integer::intValue)
                        .toArray();
            }

            if (node.getData() == null) {
                counters.add(0);

                counter++;

                queue.enqueue(node);
            } else {
                counters.getAt(counter).setData(counters.getAt(counter).getData() + 1);

                for (Node<T> child : node.getChildren()) {
                    queue.enqueue(child);
                }
            }
        }

        return Arrays.stream(counters.toArray())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
