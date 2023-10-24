public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode solution(int[] nums) {
		TreeNode root = null;
		for(var temp : nums) {
			root = insert(root, temp);
		}
		return root;
	}

	public TreeNode insert(TreeNode root, int num) {
		if(root == null) {
			return root = new TreeNode(num);
		}
		else if(num < root.val) {
			root.left = insert(root.left, num);
		}
		else if(num > root.val) {
			root.right = insert(root.right, num);
		}
		return root;
	}
}
