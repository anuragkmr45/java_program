package heap.Question;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static int findKthSmallest(int[] arr, int k) {
        if (arr.length < k) {
            throw new IllegalArgumentException("Invalid input: k is greater than array size");
        }

        // Create a min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert first k elements into the min heap
        for (int i = 0; i < k; i++) {
            minHeap.offer(arr[i]);
        }

        // Compare remaining elements with the root of the min heap
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(arr[i]);
            }
        }

        // The root of the min heap will be the kth smallest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 3;

        int kthSmallest = findKthSmallest(arr, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}
