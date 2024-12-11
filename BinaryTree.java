class Node {
    int key;
    Node left, right;

    public Node(int item) {
        this.key = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);

        Node a = new Node(2);
        tree.root.left = a;

        Node b = new Node(3);
        tree.root.right = b;

        a.left = new Node(4);
        a.right = new Node(5);

        System.out.println("Pre-order:");
        tree.printPreOrder(tree.root);

        System.out.println("\nPost-order:");
        tree.printPostOrder(tree.root);

        System.out.println("\nIn-order:");
        tree.printInOrder(tree.root);
    }
}
