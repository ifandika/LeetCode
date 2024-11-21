
import java.util.*;

Diberikan nilai, returnkan hasil berupa list. Jumlahkan dua nilai untuk hasil
dibawahnya

Contoh 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Penjelasan:
			1
		   1 1
		  1 2 1
		 1 3 3 1
		1 4 6 4 1

loop dari 0 hingga numRows
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1


public class PascalsTriangle {
	public List<List<Integer>> solution(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for(int rows = 0; rows < numRows; rows++) {
			List<Integer> temp = new ArrayList<Integer>();
			for(int column = 0; column <= rows; column++) {
				if(column == 0 || column == rows) {
					temp.add(1);
				}
				else {
					temp.add(column, result.get(rows-1).get(column-1)+result.get(rows-1).get(column));
				}
			}
			result.add(temp);
		}
		return result;
	}
}