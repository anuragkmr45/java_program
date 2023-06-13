// Given an unsorted array of integers and a positive integer k, find the kth largest element in the array. The kth largest element is the element that would be at index k-1 if the array were sorted in non-decreasing order.

package heap.Question;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] arr, int k) {
        if (arr.length < k) {
            throw new IllegalArgumentException("Invalid input: k is greater than array size");
        }

        // Create a max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Insert first k elements into the max heap
        for (int i = 0; i < k; i++) {
            maxHeap.offer(arr[i]);
        }

        // Compare remaining elements with the root of the max heap
        for (int i = k; i < arr.length; i++) {
            if (arr[i] > maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }

        // The root of the max heap will be the kth largest element
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 3;

        int kthLargest = findKthLargest(arr, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }
}
