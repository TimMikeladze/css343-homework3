public class Test {
	
	public static int inversion(int[] inputs) {
		return inversion(inputs, 0, inputs.length);
	}
	
	private static int inversion(int[] inputs, int left, int right) {
		if (right > inputs.length || left < 0 || left >= right) {
			return 0;
		}
		
		int partition = left + (right - left) / 2;
		
		int inversions = 0;
		
		if (partition > left + 1) {
			inversions += inversion(inputs, left, partition);
		}
		if (partition < right - 1) {
			inversions += inversion(inputs, partition, right);
		}
		
		inversions += merge(inputs, left, partition, right);
		return inversions;
	}
	
	private static int merge(int[] inputs, int left, int partition, int right) {
		int temp[] = new int[inputs.length];
		System.arraycopy(inputs, left, temp, left, right - left);
		
		int inversions = 0;
		
		int a = left;
		int b = partition;
		for (int i = left; i < right; i++) {
			if (a >= partition || (b < right && temp[b] < temp[a])) {
				inversions += (b - i);
				inputs[i] = temp[b++];
			}
			else {
				inputs[i] = temp[a++];
			}
		}
		
		return inversions;
	}
	
	public static boolean isBinarySearchTree(TreeNode root) {
		return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	}
	
	private static boolean isBinarySearchTree(TreeNode root, int min, int max) {
		return root == null
				|| (root.data > min && root.data < max && isBinarySearchTree(root.left, min, root.data) && isBinarySearchTree(root.right, root.data,
						max)) ? true : false;
		
	}
	
	public static int maxSum(TreeNode root) {
		return maxSumHelper(root)[1];
		
	}
	
	private static int[] maxSumHelper(TreeNode root) {
		int sums[] = { 0, 0 };
		if (root != null) {
			int left[] = maxSumHelper(root.left);
			int right[] = maxSumHelper(root.right);
			
			sums[0] = Math.max(0, Math.max(left[0], right[0]) + root.data);
			sums[1] = Math.max(Math.max(left[1], right[1]), left[0] + root.data + right[0]);
		}
		return sums;
	}
	
	public static void main(String args[]) {
		
	}
	
}