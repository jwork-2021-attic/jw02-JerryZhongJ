package S181870286.task2;

import java.util.LinkedList;

public class BubbleSorter extends Sorter {

    @Override
    public void sort() {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < elements.length - 1; i++) {
                if (elements[i] > elements[i + 1]) {
                    swap(i, i + 1);
                    sorted = false;
                }
            }
        }
    }
}
