class Node {
    String val;
    Node left, right;

    Node(String val) {
        this.val = val;
        left = right = null;
    }
}

class ExpressionTree {
    Node root;

    public ExpressionTree(String expr) {
        root = buildTree(expr);
    }

    public Node buildTree(String expr) {
        if (expr.isEmpty()) {
            return null;
        }

        return new Node(expr);
    }


    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }


    public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }


    public void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.val + " ");
        }
    }
}

 class Mainn {
    public static void main(String[] args) {
        ExpressionTree tree = new ExpressionTree("((5+2)*(2-1))/(2+9)");

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);
        System.out.println();

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Postorder traversal:");
        tree.postorder(tree.root);
        System.out.println();
    }
}
