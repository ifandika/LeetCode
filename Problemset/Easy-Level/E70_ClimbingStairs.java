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
     * 
     * 
     */
    public static int solution(int n) {
		if(n <= 3) {
            return n;
        }
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            System.out.println(Arrays.toString(dp));
        }

        return dp[n];  
	}
}