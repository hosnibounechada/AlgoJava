package org.hb.steps;

import java.util.Arrays;

public class Steps {
    // --- Directions
    // Write a function that accepts a positive number N.
    // The function should console log a step shape
    // with N levels using the # character.  Make sure the
    // step has spaces on the right hand side!
    // --- Examples
    //   steps(2)
    //       '# '
    //       '##'
    //   steps(3)
    //       '#  '
    //       '## '
    //       '###'
    //   steps(4)
    //       '#   '
    //       '##  '
    //       '### '
    //       '####'
    public void printSteps(int size) {
        for (int i = 1; i <= size; i++) {
            StringBuilder step = new StringBuilder();

            step.append("#".repeat(Math.max(0, i)));

            step.append(" ".repeat(Math.max(0, size - (i + 1) + 1)));

            System.out.println(new String(step));
        }
    }

    public void printStepsUsingShift(int size) {
        char[] steps = new char[size];
        Arrays.fill(steps, ' ');

        for (int i = 0; i < size; i++) {
            for (int j = steps.length - 1; j > 0; j--) {
                steps[j] = steps[j - 1];
            }
            steps[0] = '#'; // New value at the first index

            System.out.println(new String(steps));
        }
    }

    public void printStepsRecursive(int size) {
        StringBuilder sb = new StringBuilder();
        printStepsR(size, 1, sb);
    }

    private void printStepsR(int size, int row, StringBuilder sb) {
        if (row > size) return;

        if (sb.length() == size) {
            System.out.println(new String(sb));
            sb.setLength(0);
            row++;
        }

        if ((sb.length() < row)) {
            sb.append("#");
        } else {
            sb.append(" ");
        }

        printStepsR(size, row, sb);
    }
}
