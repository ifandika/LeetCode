
// Diberikan 2 tree, tulis fungsi untuk cek apakah tree tersebut sama dari
// segi struktur dan nilai.

// Ketentuan
// - Jika panjang berbeda maka false
// - Jika nilai berbeda TreeNode a dan b posisis sama maka false

// Algortima
// - Kita jelajahi TreeNode kiri lalu kanan dan cek setiap nilai
// TreeNode kiri dan kanan.
// - Jika kedua node kiri dan kanan sama2 kosong maka panjang sama
// maka return true
// - Jika salah satu TreeNode kosong maka panjang tidak sama, contoh
// TreeNode kiri sudah kosong tapi kanan masih lanjut maka stukturnya
// tidak sama ada yang lebih, berati return false.
// - Lalu ulangi dengan cek setiap nilai dari masing2 TreeNode jika nilai
// TreeNode kiri == TreeNode kanan lalu ulangi untuk l.kiri dan r.kiri dan
// juga l.kanan dan r.kanan.

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

public class SameTree {
	public static boolean isValid(TreeNode l, TreeNode r) {
		if(l == null && r == null) {
			return true;
		}
		else if(l == null || r == null) {
			return false;
		}
		return (l.val == r.val && isValid(l.left, r.left) && isValid(l.right, r.right));
	}
}