package S181870286.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import S181870286.task2.Goblin;
import S181870286.task2.QuickSorter;
import S181870286.task2.Sorter;

public class Scene {
    public static void main(String[] args) throws IOException {
        Matrix matrix = new Matrix(16, 16);
        ArrayList<Integer> sequence = new ArrayList<Integer>(256);
        for (int i = 0; i < 256; i++) {
            sequence.add(i);
        }
        Collections.shuffle(sequence);
        for (int i = 0; i < 256; i++) {
            int ii = sequence.get(i);
            matrix.put(new Goblin(i / 16 * 16, i % 16 * 16, 128, i), ii / 16, ii % 16);
        }
        Snake theSnake = Snake.getTheSnake();
        Sorter sorter = new QuickSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.lineUp(matrix);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
    }
}
