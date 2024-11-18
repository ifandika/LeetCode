/**
 * https://leetcode.com/problems/add-binary/submissions/962198510/
 * 
 * Problem:
 * Diberikan String a & b berisi nilai biner, jumlahkan kedua bilangan biner
 * dan kembalikan hasil dalam tipe String.
 * 
 * Contoh 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Contoh 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 * Solution Step:
 * - Buat sebuah objek tampungan (StringBuilder) untuk menampul hasil penjumlahan.
 * - buat variabel carry untuk sisa penjumlahan
 * - variabel i & j untuk index akses string (by charAt) - 1 karena length akhir index batas
 * - while dari i >= 0 atu j >= 0 atau carry == 1 (masih sisa)
 * - Jika i >= 0 (masih ada) kita tambahkah ke carry
 * - Jika j >= 0 (masih ada) kita tambahkah ke carry
 * - carry += a.charAt(i--) - '0' hanya untuk operasi agar hasil berupa integer
 * - jika hanya carry += a.charAt(i--) maka akan konversi dari char ke integer, contoh '1' maka
 *   kana menjadi 49
 * - kemudian kita masukan ke string builder dengan modulo 2, karena jika nilai 2 maka kita masukan 0
 *   dan kita bagi 2 maka hasil 1 dan 1 tersebut kita masukan ke selanjutnya.
 * - terakhir kita balik karena kita mengoperasikan dari belakang (length), jika ingin dari depan perlu
 *   buat index dari 0 dan variabel panjang
*/
import java.util.*;
import static java.lang.System.*;

public class E67AddBinary {
	public static void main(String[] args) {
		String a = "1010", b = "1011";
		out.println(solution(a, b));
		out.println((int)'1');
	}

	public static String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();

	    int carry = 0;
	    int i = a.length() - 1;
	    int j = b.length() - 1;

	    while (i >= 0 || j >= 0 || carry == 1) {
	    	if(i >= 0) {
	    		// carry += a.charAt(i--) - '0' hanya untuk operasi agar hasil berupa integer
	    		// carry += a.charAt(i--) maka akan konversi dari char ke integer
	    		carry += a.charAt(i--) - '0';
	    	}
	    	if(j >= 0) {
	    		carry += b.charAt(j--) - '0';
	    	}
	    	sb.append(carry % 2);
	    	carry /= 2;
	    }
	    // Aturan biner maka kita balik
	    return sb.reverse().toString();
	}
}