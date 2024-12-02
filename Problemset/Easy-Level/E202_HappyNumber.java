/**
 * https://leetcode.com/problems/happy-number
 * 
 * Happy Number adalah:
 * - Dimulai bilangan bulat positif, dan nilai dipecah menjadi satuan lalu 
 *   pangkatkan setiap nilai dengan pangkat 2.
 * - Jika hasil = 1 maka happy number
 * - Hati-hati terhadap putaran yang tanpa henti
 * */

import java.util.*;

public class E202_HappyNumber {
    public static void main(String[] args) {
        // Test-1
        int n = 19;
        System.out.println(solution(n));

        // Test-1
        n = 2;
        System.out.println(solution(n));
    }

    /**
     * - Menggunakan HasSet untuk menyimpan nilai, dengan hasset maka nilai
     *   tidak boleh sama
     * - perulangan while dengan kondisi true
     * - buat fungsi squareSum yaitu memcah nilai menjadi satuan lalu menguadratkan
     *   lalu dioperasikan, kembalikan hasil sum
     * - n kita tetapkan nilai dengan fungsi tersebut
     * - cek jika nilai n = 1 maka selesai/true/happy number
     * - jika tidak maka kita cek pada HashSet apakah ada nilai tersebut, jika benar
     *   maka perulangan tanpa henti, maka kita stop return false
     * - untuk setiap perulangan kita masukan nilai n ke HashSet
     */
	public static boolean solution(int n) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        while(true) {
            n = squareSum(n);
            if(n == 1) {
                return true;
            }
            else if(hashSet.contains(n)) {
                return false;
            }
            hashSet.add(n);
        }
	}

    private static int squareSum(int nums) {
        int sum = 0;
        while(nums > 0) {
            int digit = nums % 10;
            sum += digit * digit;
            nums /= 10;
        }
        return sum;
    }
}