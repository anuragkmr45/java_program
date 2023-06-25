// given an array containing 0s, 1,s 2s, and 3s write a program to sort the array so that 0s come first follow by 1s 2s and 3s 

package array.Questions;

import java.util.*;

public class SortList {
    public static List<Integer> sortList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }

        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 2, 3, 2, 1, 0 };
        List<Integer> list = sortList(arr);

        System.out.println(list.toString());
    }
}
