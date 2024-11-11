import java.util.*;

/*	Diberikan nilai integer 'n', bernilai palindrome jika nilai dibalik bernilai sama dengan
nilai awal jika tidak maka bukan palindrome.
- 'n' dapat bernilai positif & negatif

# Contoh 1:
Input: n = 121
Output 1: true
Penjelasan 1:
n = 121
n jika dibalik tetap bernilai sama.
121 == 121 -> true

# Contoh 2:
Input: n = 112
Output: false
Penjelasan:
n = 112
n jika dibalik nilainya = 211
112 == 221 -> false

# Contoh 3:
Input: n = -121
Output: false
Penjelasan:
n = -121
n jika dibalik nilainya = 121-
-121 == 121- -> false

# Algoritma
- Jika n < 0 (negatif) maka return false
- Jika n = 1 & n = 0 (bernilai tetap) maka return true
- Buat variabel untuk tampung nilai kebalikan
- Balik nilai dengan cara mengambil nilai n modulo 10 lalu n dibagi 10.
- Return jika hasil nilai kebalikan = n maka true sebaliknya false
*/

public class E9PalindromeNumber {
	public static void main(String[] args) {
		int num = 987656789;

		System.out.println(solution(num));
	}

	public static boolean solution(int num) {
	    if(num < 0) return false;
	    if(num <= 1 && num >= 0) return true;
	    int rev = 0,
	    	bfr = num;
	    while(num > 0) {
			rev *= 10;
			rev += (num % 10);
			num /= 10;
	    }
	    return (rev == bfr ? true : false);
	}
}