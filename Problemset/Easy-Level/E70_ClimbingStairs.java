/**
 * https://leetcode.com/problems/climbing-stairs/
 * 
 * - Dibutuhkan langkah 'n' untuk menaiki tangga.
 * - Setiap kali menaiki 1 atau 2 anak tangga.
 * - Banyak cara naik untuk sampai ke puncak.
 * 
 * Contoh 1:
 * Input: 5
 * Output:
 * 1. 1 + 1 + 1 + 1 + 1
 * 2. 1 + 1 + 1 + 2
 * 3. 1 + 2 + 2
 * 4. 2 + 2 + 1
 * 5. 2 + 1 + 1 + 1
 * 6. 1 + 2 + 1 + 1
 * 7. 2 + 1 + 2
 * 8. 1 + 1 + 2 + 1
 * 
 * Solusi 1: Brute Force
 * Bisa menggunakan fibonaci.
 * Solusi 2: Dynamic Programming
 * Menggunakan 
 * Solusi 3:
 * Menggunakan matriks eksponen
 */

import java.util.*;

public class E70_ClimbingStairs {
    public static void main(String[] args) {
        // Test-1

        int n = 7;
        System.out.println(solution(n));
    }

	/**
     * Hint - Fibonacci
     * 
     * - Kita perlu tahu untuk setiap n punya berapa langkah
     * - Contoh kemungkinan langkah n = 3
     *      n = 3
     *      - 1 + 1 + 1
     *      - 1 + 2
     *      - 2 + 1
     *      (3 kemungkinan menaiki tangga 3)
     * - Lalau untuk mencari tahu n = n-1 + n-2
     * - Dimana yang kita jumlahkan adalah total langkah
     * - Contoh: 
     *      n = 4 ?
     *      n4 = n3 + n2
     *      dimana langkah n = 3 adalah 3 kemungkinan
     *      dimana langkah n = 2 adalah 2 kemungkinan
     *      maka n4 = 3 + 2
     *              = 5 kemungkinan
     * - Untuk kemungkinan langkah
     * n    = 1  2  3  4  5  6  7
     * step = 1  2  3  5  8  13 21
     */
    public static int solution(int n) {
		if(n <= 3) { return n; }
        int[] everyStepN = new int[n + 1];

        // Langkah dasar n sampai 3
        everyStepN[0] = 1;
        everyStepN[1] = 2;
        everyStepN[2] = 3;

        // Kita mulai dari 4
        for (int i = 3; i <= n; i++) {
            everyStepN[i] = everyStepN[i - 1] + everyStepN[i - 2];
        }
        return everyStepN[n-1];
	}

    // Lebih mudah karena kita tidak pakai array index 0
    public static int solution2(int n) {
        if(n <= 3) { return n; }
        int[] everyStepN = new int[n + 1];

        // Langkah dasar n sampai 3
        everyStepN[1] = 1;
        everyStepN[2] = 2;
        everyStepN[3] = 3;

        // Kita mulai dari 4
        for (int i = 4; i <= n; i++) {
            everyStepN[i] = everyStepN[i - 1] + everyStepN[i - 2];
        }
        return everyStepN[n];
    }
}