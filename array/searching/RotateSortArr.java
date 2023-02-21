// Search in Rotated Sorted Array

// Given a sorted and rotated array arr[] of size N and a key, the task is to find the key in the array.

// Note: Find the element in O(logN) time and assume that all the elements are distinct.

// Example:  

// Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}, key = 3
// Output : Found at index 8    

package array.searching;

public class RotateSortArr {
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > arr[start]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = end + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
