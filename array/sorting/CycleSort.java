package array.sorting;

import java.util.*;

public class CycleSort {
    static void CSort(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            int correct = array[i] - 1;
            if (array[i] != correct) {
                swap(array, i, i - 1);
            } else {
                break;
            }
        }
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 5, 5, 6, 8, 9 };
        CSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
