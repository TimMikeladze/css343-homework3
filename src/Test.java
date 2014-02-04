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
        return maxSumHelper(root)[1];
    }

    private static int[] maxSumHelper(TreeNode root) {
        int values[] = { 0, 0 };
        if (root != null) {
            int l[] = maxSumHelper(root.left);
            int r[] = maxSumHelper(root.right);

            values[0] = Math.max(0, Math.max(l[0], r[0]) + root.data);
            values[1] = Math.max(Math.max(l[1], r[1]), l[0] + root.data + r[0]);
        }
        return values;
    }

    public static void main(String args[]) {
        /*
        TreeNode r = new TreeNode(4);
        r.left = new TreeNode(2);
        r.left.left = new TreeNode(1);
        r.left.right = new TreeNode(3);
        r.right = new TreeNode(5);
        System.out.println(isBinarySearchTree(r));
        */

        /*
        TreeNode r = new TreeNode(-10);
        r.left = new TreeNode(2);
        r.left.left = new TreeNode(4);
        r.left.right = new TreeNode(5);
        r.right = new TreeNode(3);
        r.right.right = new TreeNode(9);
        r.right.left = new TreeNode(7);
        System.out.println(maxSum(r));
        */

    }

}