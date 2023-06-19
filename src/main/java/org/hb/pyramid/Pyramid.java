package org.hb.pyramid;

public class Pyramid {
    // --- Directions
    // Write a function that accepts a positive number N.
    // The function should console log a pyramid shape
    // with N levels using the # character.  Make sure the
    // pyramid has spaces on both the left *and* right hand sides
    // --- Examples
    //   pyramid(1)
    //       '#'
    //   pyramid(2)
    //       ' # '
    //       '###'
    //   pyramid(3)
    //       '  #  '
    //       ' ### '
    //       '#####'
    public void printPyramid(int size) {
        StringBuilder sb = new StringBuilder();

        sb.append(" ".repeat(Math.max(0, size * 2 - 1)));

        int statIndex = size - 1;
        int endIndex = statIndex;

        while (size > 0) {
            sb.setCharAt(statIndex--, '#');
            sb.setCharAt(endIndex++, '#');

            System.out.println(new String(sb));
            size--;
        }
    }

    public void printPyramidRecursive(int size) {
        StringBuilder sb = new StringBuilder();

        sb.append(" ".repeat(Math.max(0, size * 2 - 1)));

        printPyramidRecursively(size, size - 1, size - 1, sb);
    }

    private void printPyramidRecursively(int size, int startIndex, int endIndex, StringBuilder sb) {

        if(size <= 0) return;

        sb.setCharAt(startIndex--, '#');
        sb.setCharAt(endIndex++, '#');

        System.out.println(new String(sb));

        printPyramidRecursively(--size, startIndex, endIndex, sb);
    }
}
