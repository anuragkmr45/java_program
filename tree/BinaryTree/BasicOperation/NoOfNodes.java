package tree.BinaryTree.BasicOperation;

public class NoOfNodes {
    public static int countOfNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int left = countOfNodes(root.left);
        int right = countOfNodes(root.right);

        return left + right + 1;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        CreateBT tree = new CreateBT();
        Node root = tree.createTreeFromArr(nodes);

        System.out.println(countOfNodes(root));
    }
}
