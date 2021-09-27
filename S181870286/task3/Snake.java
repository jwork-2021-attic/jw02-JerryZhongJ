package S181870286.task3;

import java.util.LinkedList;

import S181870286.task2.Linable;
import S181870286.task2.Sorter;

public class Snake {
    private static Snake theSnake;
    private Sorter sorter;
    public static Snake getTheSnake() {
        if (theSnake == null) {
            theSnake = new Snake();
        }
        return theSnake;
    }

    private Snake() {

    }
    
    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Matrix matrix) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = matrix.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        System.out.println(sorter.getPlan().size());
        for (Sorter.Pair step : sorter.getPlan()) {
            this.execute(matrix, step);
            // System.out.println(i++);
            log += matrix.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private void execute(Matrix matrix, Sorter.Pair step) {
        matrix.get(step.a / 16, step.a % 16).swapPosition(matrix.get(step.b / 16, step.b % 16));
    }

}
