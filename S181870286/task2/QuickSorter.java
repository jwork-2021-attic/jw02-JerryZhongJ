package S181870286.task2;

public class QuickSorter extends Sorter {

    @Override
    public void sort() {
        // TODO Auto-generated method stub
        sort(0, elements.length);
    }
    
    private void sort(int st, int en) {
        if (st + 1 >= en)
            return;
        int left_ptr = st, right_ptr = en - 1;
        int mid = elements[(st + en) / 2];
        while (left_ptr <= right_ptr) {
            while (elements[left_ptr] < mid)
                left_ptr++;
            while (elements[right_ptr] > mid)
                right_ptr--;
            if (left_ptr <= right_ptr) {
                swap(left_ptr, right_ptr);
                left_ptr++;
                right_ptr--;
            }
        }
        sort(st, right_ptr + 1);
        sort(left_ptr, en);
    }
    
}
