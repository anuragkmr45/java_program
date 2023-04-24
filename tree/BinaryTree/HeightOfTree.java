package tree.BinaryTree;

public class HeightOfTree {
    public static int height(Node root) {

        if (root == null) {
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        int totalHeight = Math.max(left, right) + 1;

        return totalHeight;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        CreateBT tree = new CreateBT();
        Node root = tree.createTreeFromArr(nodes);

        System.out.println(height(root));
    }
}
