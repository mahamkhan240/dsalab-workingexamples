import java.util.*;

class Nodee {
    int val;
    Nodee left, right;

    Nodee(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinaryTreeToBST {

    public void binaryTreeToBST(TreeNode root) {
        if (root == null) return;

        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);

        Collections.sort(values);
        Iterator<Integer> iter = values.iterator();

        convertToBST(root, iter);
    }

    private void inorderTraversal(TreeNode root, List<Integer> values) {
        if (root != null) {
            inorderTraversal(root.left, values);
            values.add(root.val);
            inorderTraversal(root.right, values);
        }
    }

    private void convertToBST(TreeNode root, Iterator<Integer> iter) {
        if (root != null) {
            convertToBST(root.left, iter);
            root.val = iter.next();
            convertToBST(root.right, iter);
        }
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }
}

 class Driverr {
    public static void main(String[] args) {
        BinaryTreeToBST converter = new BinaryTreeToBST();


        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);

        System.out.println("Inorder traversal of original tree:");
        converter.inorder(root);
        System.out.println();

        converter.binaryTreeToBST(root);

        System.out.println("Inorder traversal of the BST:");
        converter.inorder(root);
        System.out.println();
    }
}
