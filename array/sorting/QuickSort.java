package array.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array) {
        helperQSort(array, 0, array.length - 1);
    }

    public static void helperQSort(int[] array, int low, int heigh) {
        if (low > heigh) {
            System.out.println("Empty array");
            return;
        }

        int pivot = partiation(array, low, heigh - 1);

        helperQSort(array, 0, pivot - 1);
        helperQSort(array, pivot + 1, heigh);
    }

    public static int partiation(int[] array, int low, int heigh) {
        int pivot = array[heigh];
        int iterator = low - 1;

        for (int i = low; i < heigh; i++) {
            if (array[i] < pivot) {
                iterator++;

                swap(array, array[iterator], array[i]);
            }
        }

        iterator++;
        swap(array, array[iterator], array[heigh]);

        return 0;
    }

    public static void swap(int[] array, int indexOfA, int indexOfB) {
        int temp = array[indexOfA];
        array[indexOfA] = array[indexOfB];
        array[indexOfB] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 11, 5, 4, 3, 2 };

        helperQSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}