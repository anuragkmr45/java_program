package tree.BinaryTree;

public class CreateBT {
    Node root;

    int index = -1;

    // create Binary treee from array
    // return root of the tree
    public Node createTreeFromArr(int[] nodes) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = createTreeFromArr(nodes);
        newNode.right = createTreeFromArr(nodes);

        return newNode;
    }

    public static void main(String[] args) {
        int[] nodes = { 9, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        CreateBT tree = new CreateBT();
        Node root = tree.createTreeFromArr(nodes);

        System.out.println(root.data);
    }
}
