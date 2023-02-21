// Maximum and minimum of an array using minimum number of comparisons - https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

// Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

// Examples:

// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
//               Maximum element is: 9

// Input: arr[] = {22, 14, 8, 17, 35, 3}
// Output:  Minimum element is: 3
//               Maximum element is: 35

package array.GenOperation;

public class MaxMin {
    class Result {
        int max;
        int min;
    }

    Result maxmin(int[] arr) {
        Result ans = new Result();

        int len = arr.length;
        if (len == 0) {
            ans.max = -1;
            ans.min = -1;

            return ans;
        }

        if (len == 1) {
            ans.max = arr[0];
            ans.min = arr[0];

            return ans;
        }

        if (arr[0] > arr[1]) {
            ans.max = arr[0];
            ans.min = arr[1];
        } else {
            ans.max = arr[1];
            ans.min = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > ans.max) {
                ans.max = arr[i];
            } else if (arr[i] < ans.min) {
                ans.min = arr[i];
            }
        }
        return ans;
    }

}
