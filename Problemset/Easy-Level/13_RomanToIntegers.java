import java.util.*;

/*	Diberikan string 's' tentukan nilai total 'n'.
Simbol       Nilai
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

# Contoh 1:
Input: s = "III"
Output: 3
Penjelasan: III = 3.

# Contoh 2:
Input: s = "LVIII"
Output: 58
Penjelasan: L = 50, V= 5, III = 3.

# Contoh 3:
Input: s = "MCMXCIV"
Output: 1994
Penjelasan: M = 1000, CM = 900, XC = 90 and IV = 4.

# Algoritma
- Buat struktur data hashmap untuk tampung simbol dan nilai yang sudah ditentukan
- Perulangan hingga panjang string s
- 
*/

public class RomanToIntegers {
	public int solution(String s) {
		HashMap<Character, Integer> hm = new HashMap<>(7);
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		int result = 0;
		for(int i=0; i<s.length(); i++) {
			if(i+1 < s.length() && hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))) {
				result -= hm.get(s.charAt(i));
			} 
			else {
				result += hm.get(s.charAt(i));
			}
		}
		return result;
	}
}