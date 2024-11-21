/**
 * https://leetcode.com/problems/rotate-string/
 * 
 * Problem
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * - For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * 
 */
// Penjelasan
// - Cocokan apakah nilai s di shiftkan sebanyak n apakah sama dengan nilai goal.
// - s = abcde
//   s shift 1 = bcdea nilai a yang berubah
//   s shift 2 = cdeab nilai ab yang berubah
//   s shift 3 = deabc nilai abc yang berubah
//   s shift 4 = eabcd nilai abcd yang berubah
// - Untuk setiap nilai

// Solusi 1:
// - Jika panjang kedua berbeda maka tidak mungkin untuk membandingkan maka return false
// - Jika salah satu null maka return false
// - 

// Solusi 2:
// - Jika panjang nilai s dengan goal maka benar
// - Jika nilai s+s berisi nilai goal maka true
// 	abcde = s+s (abcdeabcde)

public class E796_RotateString {
	public boolean solution(String s, String goal) {

	}

	public boolean solution2(String s, String goal) {
		if(s.length() == goal.length()) {
			String merge = (s+s);
			if(merge.contains(goal)) {
				return true;
			}
		}
		return false;
		// Or return (s.length() == goal.length() && (s+s).contains(goal));
	}	
}