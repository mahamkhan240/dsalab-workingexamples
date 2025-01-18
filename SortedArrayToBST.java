class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = sortedArrayToBSTHelper(nums, left, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, right);

        return node;
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }
}

 class Driver {
    public static void main(String[] args) {
        SortedArrayToBST converter = new SortedArrayToBST();

        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = converter.sortedArrayToBST(nums);

        System.out.println("Inorder traversal of the BST:");
        converter.inorder(root);
        System.out.println();
    }
}
