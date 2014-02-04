public class Test {

    public static int inversion(int[] inputs) {
        return 0;
        //add your code for Q1 here
    }

    public static boolean isBinarySearchTree(TreeNode root) {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    private static boolean isBinarySearchTree(TreeNode root, int min, int max) {
        return root == null
                || (root.data > min && root.data < max && isBinarySearchTree(root.left, min, root.data) && isBinarySearchTree(
                        root.right, root.data, max)) ? true : false;

    }

    public static int maxSum(TreeNode root) {
        return 0;
        //add your code for Q3 here.

    }

    public static void main(String args[]) {
        TreeNode r = new TreeNode(4);
        r.left = new TreeNode(2);
        r.left.left = new TreeNode(1);
        r.left.right = new TreeNode(3);
        r.right = new TreeNode(5);
        System.out.println(isBinarySearchTree(r));
    }

}