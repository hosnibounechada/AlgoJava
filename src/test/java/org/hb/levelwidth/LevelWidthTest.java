package org.hb.levelwidth;

import org.hb.tree.Node;
import org.hb.tree.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelWidthTest {

    @Test
    void itShouldLevelWidth() {
        // Given
        int[] expectedResult = {1, 3, 3};

        Node<String> nodeA = new Node<>("A");
        // Children of A
        nodeA.add("B");
        nodeA.add("C");
        nodeA.add("D");

        // Children of C
        nodeA.getChildren().get(1).add("E");
        nodeA.getChildren().get(1).add("F");

        // Children of D
        nodeA.getChildren().get(2).add("G");

        // When
        Tree<String> tree = new Tree<>();
        tree.setRoot(nodeA);

        LevelWidth<String> levelWidth = new LevelWidth<>();
        int[] result = levelWidth.levelWidth(tree.getRoot());
        // Then

        assertArrayEquals(expectedResult, result);
    }
}