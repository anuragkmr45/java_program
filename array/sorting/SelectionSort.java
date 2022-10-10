package array.sorting;

public class SelectionSort {
    static void SSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int max = getMax(array, 0, last);
            swap(array, max, last);
        }
    }

    static void swap  (int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static int getMax(int[] array, int start, int end) {

        int max  = start;

        for (int i = 0; i < end; i++){
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }
}
