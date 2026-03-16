/*	Diberikan array bilangan bulat urut dengan nilai yang berbeda {@code nums}, cari nilai 
{@code target} dalam array, jika ketemu kembalikan nilai index dari nilai array yang cocok.
Jika tidak kembalikan nilai dimana nilai target dalam array dengan nilai yang urut.

Contoh 1:
Input: nums = {1, 3, 4, 6, 7}, target = 6
Output: 3, (nilai 6 berada pada index/urutanke 3)

Contoh 2:
Input: nums = {1, 2, 5, 7, 8}, target = 3
Output: 2
Penjelasan:
Hasil benrnilai 2 jika nilai target dimasukan kedalam array akan menempati idex 2,
nums = {1, 2, 5, 7, 8} maka nilai 3 diposisi setelah angka 2 dimana angka di index 1.
		0  1  2  3  4

(nilai target dimasukan)
nums = {1, 2, (3)5, 7, 8}
		0  1   2    3  4

Algoritma 1 (Menggunakan pengecekan setiap nilai dari awal hingga akhir)
- Perulangan dari 0-panjang array
- Jika nilai array index i = {@code target} return i(Posisi nilai)
- Jika tidak cek jika nilai array index i > {@Code target} maka otomatis posisi ini
  posisi nilai {@Code target} jika dimasukan ke array.
- kembalikan nilai panjang array jika nilai target diluar kondisi yang ada.
*/
public class SearchInsertPosition {
	public int solution(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == target) return i;
			else if(nums[i] > target) return i;
		}
		return nums.length;
	}

	// public int solution(int[] nums, int target) {
	// 	int start = 0,
	// 		end = nums.length-1,
	// 		mid;
	// 	while(start <= end) {
	// 		mid = (start + end) / 2;
	// 		switch(nums) {
	// 			case nums[start] == target:
	// 				return start;
	// 				break;
	// 			case nums[end] == target:
	// 				return end;
	// 				break;
	// 			case nums[mid] == target:
	// 				return mid;
	// 				break;
	// 		}
	// 	}
	// }
}