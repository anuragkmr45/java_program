package heap.operation;

public class MaxHeapChecker {
    public static boolean isMaxHeap(int[] arr) {
        int n = arr.length;

        // Check each node starting from the last parent node
        for (int i = (n / 2) - 1; i >= 0; i--) {
            if (!isMaxHeapUtil(arr, n, i)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isMaxHeapUtil(int[] arr, int n, int i) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // Check if the left child exists and if its value is greater than the parent
        if (leftChild < n && arr[leftChild] > arr[i]) {
            return false;
        }

        // Check if the right child exists and if its value is greater than the parent
        if (rightChild < n && arr[rightChild] > arr[i]) {
            return false;
        }

        // Recursively check the left and right subtrees
        return (leftChild >= n || isMaxHeapUtil(arr, n, leftChild))
                && (rightChild >= n || isMaxHeapUtil(arr, n, rightChild));
    }

    public static void main(String[] args) {
        int[] arr = { 90, 15, 10, 7, 12, 2, 7, 3 };

        if (isMaxHeap(arr)) {
            System.out.println("The given binary tree is a max heap.");
        } else {
            System.out.println("The given binary tree is not a max heap.");
        }
    }
}
