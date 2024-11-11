// - Urutkan nilai nums (sort)
// - Cari nilai > -1 sebagai nilai pembanding

import java.util.*;

class TreeNode {
	int val;
	TreeNode left, right;
	TreeNode() {}
	TreeNode(int v) {
		val = v;
	}
	TreeNode(int v, TreeNode l, TreeNode r) {
		val = v;
		left = l;
		right = r;
	}
}

public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		int[] nums = {-10, -3, 0, 5, 9};
		// TreeNode res = solution(nums);
		TreeNode res = solution2(nums);
		// System.out.println(res.val);
		print(res);
	}

	public static TreeNode solution2(int[] nums) {
		return convert(nums, 0, nums.length-1);
	}

	public static TreeNode convert(int[] nums, int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = ((start + end) / 2);
		TreeNode node = new TreeNode(nums[mid]);

		node.left = convert(nums, start, mid-1);
		node.right = convert(nums, mid+1, end);

		return node;
	}

	public static TreeNode solution(int[] nums) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int length = nums.length, val = 0;
		TreeNode tn = null;
		for(int i = 0; i < length; i++) {
			val = nums[i];
			if(val >= 0) {
				tn = new TreeNode(val);
				break;
			}
		}
		for(int i = 0; i < length; i++) {
			int num = nums[i];
			if(num != val) {
				tn = insert(tn, num);
			}
		}
		return tn;
	}

	public static TreeNode insert(TreeNode root, int num) {
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

	public static void print(TreeNode node) {
		if(node != null) {
			System.out.println(node.val);
			print(node.left);
			print(node.right);
		}
	}
}
