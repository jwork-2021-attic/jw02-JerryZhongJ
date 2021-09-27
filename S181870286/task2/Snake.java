package S181870286.task2;

import java.util.LinkedList;

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

    public String lineUp(Line line) {

        String log = new String();

        if (sorter == null) {
            return null;
        }

        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];

        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }

        sorter.load(ranks);
        sorter.sort();

        System.out.println(sorter.getPlan().size());
        for (Sorter.Pair step : sorter.getPlan()) {
            this.execute(line, step);
            // System.out.println(i++);
            log += line.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private void execute(Line line, Sorter.Pair step) {
        line.get(step.a).swapPosition(line.get(step.b));
    }

}
