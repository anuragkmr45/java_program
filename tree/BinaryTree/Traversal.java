package tree.BinaryTree;

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

    public static void main(String[] args) {
        int[] nodes = { 9, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        CreateBT tree = new CreateBT();
        Node root = tree.createTreeFromArr(nodes);

        preOrderTravers(root);
        System.out.println();
        inOrderTravers(root);
        System.out.println();
        postOrderTravers(root);
    }
}
