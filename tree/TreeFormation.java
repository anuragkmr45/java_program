package tree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    TreeNode root;

    public Tree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    private TreeNode insertRecursive(TreeNode current, int data) {
        if (current == null) {
            return new TreeNode(data);
        }

        if (data < current.data) {
            current.left = insertRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = insertRecursive(current.right, data);
        }

        return current;
    }

    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    private boolean searchRecursive(TreeNode current, int data) {
        if (current == null) {
            return false;
        }

        if (data == current.data) {
            return true;
        }

        if (data < current.data) {
            return searchRecursive(current.left, data);
        } else {
            return searchRecursive(current.right, data);
        }
    }
}

public class TreeFormation {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // Inserting elements into the tree
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);
        tree.insert(12);
        tree.insert(18);

        // Searching for elements in the tree
        System.out.println("Search for element 7: " + tree.search(7));
        System.out.println("Search for element 20: " + tree.search(20));
    }
}
