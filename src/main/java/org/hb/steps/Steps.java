package org.hb.steps;

public class Steps {
    public void printSteps(int size){
        for(int i = 1; i <= size; i++){
            StringBuilder step = new StringBuilder();

            step.append("#".repeat(Math.max(0, i)));

            step.append(" ".repeat(Math.max(0, size - (i + 1) + 1)));

            System.out.println(new String(step));
        }
    }
}
