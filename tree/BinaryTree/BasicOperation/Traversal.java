package tree.BinaryTree.BasicOperation;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {
    public static void preOrderTravers(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }

        System.out.print(root.data + " ");
        preOrderTravers(root.left);
        preOrderTravers(root.right);
    }

    public static void inOrderTravers(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }

        inOrderTravers(root.left);
        System.out.print(root.data + " ");
        inOrderTravers(root.right);
    }

    public static void postOrderTravers(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");
            return;
        }

        postOrderTravers(root.left);
        postOrderTravers(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrderTravers(Node root) {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currElemet = queue.remove();

            if (currElemet == null) {
                System.out.println();

                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currElemet.data + " ");

                if (currElemet.left != null) {
                    queue.add(currElemet.left);
                }

                if (currElemet.right != null) {
                    queue.add(currElemet.left);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        CreateBT tree = new CreateBT();
        Node root = tree.createTreeFromArr(nodes);

        levelOrderTravers(root);
    }
}
