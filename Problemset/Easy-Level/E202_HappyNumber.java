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