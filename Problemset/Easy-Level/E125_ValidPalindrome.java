/**
 * https://leetcode.com/problems/palindrome-number/
 */
import java.util.*;

public class E125_ValidPalindrome {
	public static void main(String[] args) {
		String examInput1 = "A man, a plan, a canal: Panama";
		boolean examOutput1 = true;

		// Output: True
		System.err.println(solution(examInput1) == examOutput1);
	}

	/**
	 * Step
	 * - Kita buat string baru dengan string asli kita lower case
	 * - Kita buat variabel index awal (left) = 0 lalu batas (right) = panjang - 1
	 * - Lakukan perulangan dengan while dan kondisi nilai left < right
	 * - Perulangan lagi dengan kondisi nilai left < right dan cek apakah karakter /
	 * char index left huruf atau bilangan
	 * Lalu sama untuk sisi kanan dengan index right, jika left kita naikan left++ &
	 * kanan turunkan right--
	 * - Kemudian kita cek palindrome dengan membandingkan huruf / data index kiri
	 * dengan kanan jika tidak sama maka kita
	 * kembalikan salah (false)
	 * Terakhir kita naikan index left & kurangi right dan kita returnkan true
	 * 
	 * @param s Data teks
	 * @return
	 */
	public static boolean solution(String s) {
		String lower = s.toLowerCase();
		int left = 0, right = s.length() - 1;

		while (left < right) {
			while (left < right && !Character.isLetterOrDigit(lower.charAt(left))) {
				left++;
			}
			while (right > left && !Character.isLetterOrDigit(lower.charAt(right))) {
				right--;
			}
			if (lower.charAt(left) != lower.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}