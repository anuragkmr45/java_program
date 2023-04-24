package tree.BinaryTree.BasicOperation;

public class SumAllNode {
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);

        return left + right + root.data;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        CreateBT tree = new CreateBT();
        Node root = tree.createTreeFromArr(nodes);

        System.out.println(sumOfNodes(root));
    }
}
