/**
 * https://leetcode.com/problems/remove-element/
 * 
 * Diberikan array bilangan bulat {@code nums}, dan variabel {@code val}. Hapus semua nilai
 * yang bernilai val pada elemen array {@code nums}. Urutan elemen data array mungkin berubah.
 * Lalu returnkan total hasil elemen array yang tidak bernilai sama variabel {@code nums}.
 * 
 * Contoh 1:
 * Input: nums = {1, 1, 3, 3, 1}, val = 1
 * Output: 2 (Terdapat 2 nilai yang tidak sama), nums = {3, 3, 0, 0, 0}
 * Penjelasan:
 * nums = {1, 1, 3, 3, 1} dan val = 1, maka kita hapus nilai yang bernilai 1, lalu total nilai
 * yang tidak bernilai 1 ada 2(3, 3).
 * 
 * Algoritma
 * "Bisa juga di sorting dulu agar lebih mudah"
 * - Kita cek jika panjang array < 1 maka return 0
 * - Kita cek jika nilai nums negatif(nums < 0) maka return 0
 * - Kita buat variabel {@code index} untuk mengganti nilai array dengan nilai yang bernilai tidak sama
 * - Perulangan dari 0-panjang array, cek jika nilai array nomer {@code i} !=(tidak sama) dengan nilai
 *   {@code nums} maka kita tetapkan ke array.
 * - Lalu returnkan {@code index} total nilai yang tidak sama dengan nilai {@code nums}.
*/
import java.util.*;

public class E27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println(solution2(nums, val));
    }

	public static int solution(int[] nums, int val) {
		int length = nums.length;
		if(length < 1 ) return 0;
		int index = 0;
		for(int i = 0; i < length; i++) {
			if(nums[i] != val) {
				nums[index++] = nums[i];
			}
		}
		return index;
	}

    public static int solution2(int[] nums, int val) {
        int length = nums.length;
        if(length < 1) return 0;

        Arrays.sort(nums);
        int index = 0;
        for(int i = 0; i < length; i++) {
            if(nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}