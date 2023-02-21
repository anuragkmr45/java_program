// Write a program to reverse an array or string - https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
// Given an array (or string), the task is to reverse the array/string.

// Examples : 

// Input  : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}

// Input :  arr[] = {4, 5, 1, 2}
// Output : arr[] = {2, 1, 5, 4}

package array.GenOperation;

public class ReverseArr {
    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length;

        while (start < end) {
            swap(arr[start], arr[end]);

            start = start + 1;
            end = end - 1;
        }

        return arr;
    }
    
    static void swap(int first, int second) {
        int temp = first;
        first = second;
        second = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(reverse(arr).toString());
    }
}
