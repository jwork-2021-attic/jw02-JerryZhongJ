package S181870286.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Scene {
    public static void main(String[] args) throws IOException {
        Line line = new Line(256);
        ArrayList<Integer> sequence = new ArrayList<Integer>(256);
        for (int i = 0; i < 256; i++) {
            sequence.add(i);
        }
        Collections.shuffle(sequence);
        for (int i = 0; i < 256; i++) {
            line.put(new Goblin(i, i, i, i), sequence.get(i));
        }
        Snake theSnake = Snake.getTheSnake();
        Sorter sorter = new QuickSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.lineUp(line);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
    }
}
