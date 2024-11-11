/*	Diberikan tree (@code root) berisi bilangan integer dan nilai {@code targetSum}, lakukan
pencarian jika setiap nilai ditambah == nilai {@code targetSum} maka return true.

# Contoh 1:
		Nilai Tree

			(5)
		   /   \
		 (4)   (8)
		/
	  (11)	
	 /   \
   (7)   (2)
Input: nlai tree, targetSUm = 22
Output: true
Penjelasan:
Penambahan (p) ke kiri, kiri, kanan -> 5 + 4 + 11 + 2 = 22
p1 -> 5 + 4 		 = 9
p2 -> 5 + 4 + 11 	 = 20
p3 -> 5 + 4 + 11 + 7 = 27
p4 -> 5 + 4 + 11 + 2 = 22
p5 -> 5 + 8 		 = 13

# Algoritma

*/

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class PathSum {
	static int res = 0;
	public static boolean solution(TreeNode root, int targetSum) {
		return sum(root, targetSum, 0) == targetSum ? true : false;
	}

	public static int sum(TreeNode root, int targetSum, int total) {
		if(total == targetSum) {
			res = total;
		}
		if(root == null) return -1;
		if(root != null) {
			sum(root.left, targetSum, total + root.val);
			sum(root.right, targetSum, total + root.val);
		}
		return res;
	}

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(5);
		tn.left = new TreeNode(4);
		tn.right = new TreeNode(8);
		tn.left.left = new TreeNode(11);
		tn.left.left.left = new TreeNode(7);
		tn.left.left.right = new TreeNode(2);

		System.out.println(solution(tn, 22));
	}
}