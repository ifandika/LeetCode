// Soal
// Diberikan bilangan bulat rowIndex, kembalikan rowIndex-i (0-index) baris PT(Pascals Triangle).
// Pada PT setiap nilai merupakan penjumlahan 2 nilai di atasnya.

// Solusi Naif
// - Kita buat / generate hingga rowIndex
// - Lalu kita returnkan Hasil yang terakhir / == rowIndex

import java.util.*;

public class PascalsTriangle2 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3)));	
	}

	public static List<Integer> solution(int rowIndex) {
		if(rowIndex == 0) {
			return List.of(1);
		}
		// Coba hanya menyimpan hasil sebelum, tidak perlu menyimpan semua.
		// List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> listPrev = new ArrayList<Integer>();
		for(int rows = 0; rows < rowIndex; rows++) {
			List<Integer> temp = new ArrayList<Integer>();
			if(rows == 0) {
				temp.add(1);
				listPrev = temp;
			}
			else if(rows == rowIndex) {
				return listPrev;
			}
			else {
				temp.add(column, listPrev.get(rows).get(column)+listPrev.get(rows-1).get(column));
				listPrev = temp;
			}
		}
		return null;
	}
}