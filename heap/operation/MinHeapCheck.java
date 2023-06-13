package heap.operation;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class MinHeapCheck {
    static boolean isMinHeap(Node root) {
        // Check if the tree is empty or has a single node
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        // Check if the value of the root is smaller than or equal to the values of its
        // children
        if (root.left != null && root.left.data < root.data) {
            return false;
        }
        if (root.right != null && root.right.data < root.data) {
            return false;
        }

        // Recursively check if both left and right subtrees are min heaps
        return isMinHeap(root.left) && isMinHeap(root.right);
    }

    public static void main(String[] args) {
        // Create a binary tree
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);

        // Check if the tree is a min heap
        boolean isMinHeap = isMinHeap(root);

        if (isMinHeap) {
            System.out.println("The binary tree is a min heap.");
        } else {
            System.out.println("The binary tree is not a min heap.");
        }
    }
}
