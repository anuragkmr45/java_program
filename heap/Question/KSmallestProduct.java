package heap.Question;

import java.util.Arrays;

public class KSmallestProduct {
    public static long calculateProduct(int[] arr, int k) {
        if (arr.length < k) {
            throw new IllegalArgumentException("Invalid input: k is greater than array size");
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Calculate the product of the k smallest elements
        long product = 1;
        for (int i = 0; i < k; i++) {
            product *= arr[i];
        }

        return product;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 4, 6, 1 };
        int k = 3;

        long product = calculateProduct(arr, k);
        System.out.println("Product of the " + k + " smallest elements: " + product);
    }
}
