/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 *
 * 
 * Diberikan head dari sorted listNode, hapus semua duplikat sehingga elemen
 * hanya muncul satu saja. kembalikan hasil listNode yang tidak duplikat.
 * 
 * Contoh 1:
 * Input: head = 1, 1, 2, 2, 3
 * Output: 1, 2, 3
 * Penjelasan:
 * head = 1, 1, 2, 2, 3
 * n1 = 1 (pertama muncul)
 * n2 = 1 (nilai sudah muncul maka duplikat)
 * n3 = 2 (pertama muncul)
 * n4 = 2 (nilai sudah muncul maka duplikat)
 * n5 = 3 (pertama muncul)
 * maka hasil
 * head = 1, 2, 3
 * 
 * Algoritma 1:
 * - Cek jika head null,blank
 * - Jelajah dari n1 - panjang listNode
 * - Ambil nilai pertama, lalu lanjut ke nilai kedua dan cek jika nilai kedua =
 *   nilai pertama maka lewati dan seterusnya.
*/

import java.util.Stack;

public class E26_RemoveDuplicateFromSortedArray {
	public static void main(String[] args) {
		int[] nums = {1, 2, 1, 1, 2, 3, 2};
		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {
		int[] tempNum = nums;
		int[] hasilAkhir;
		
		int jumlahNilai = remove(tempNum);
		
		hasilAkhir = new int[jumlahNilai];
		for(int i = 0; i < jumlahNilai; i++) {
			hasilAkhir[i] = tempNum[i];
		}
		return jumlahNilai;
  }
  
  public static int remove(int[] num) {
		Stack<Integer> stack = new Stack<>();
		int jumlahNilai = 0;
		// Kita masukan nilai ke stack, namun nilai yang sudah ada tidak boleh dimasukan lagi
		for(int i = num.length-1; i >= 0; i--) {
			if(stack.empty()) {
				jumlahNilai++;
				stack.push(num[i]);
			}
			else if(num[i] != stack.peek()) {
				jumlahNilai++;
				stack.push(num[i]);
			}
		}
		for(int i = 0; i < jumlahNilai; i++) {
			// Pindahkan nilai
			num[i] = stack.pop();
		}
		return jumlahNilai;
	}
}