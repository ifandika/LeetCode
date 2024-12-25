/**
 * https://leetcode.com/problems/smallest-number-with-all-set-bits
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E3370_SmallestNumberWithAllSetBits {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }

    /**
     * - Kita konversi n ke biner
     * - hasil konversi berupa biner kita ganti nilai 0 menjadi nilai 1
     * - lalu kita konversi ke desimal
     */
    public static int solution(int n) {
        int[] binary = decToBi(n);
        Arrays.fill(binary, 1);
        System.out.println(Arrays.toString(binary));
        return biToDec(binary);
    }

    // Decimal to binary
    public static int[] decToBi(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int res = 0;
        while(n > 0) {
            al.add(n % 2);
            n /= 2;
        }
        return al.stream().mapToInt(i -> i).toArray();
    }

    // Binary to decimal
    public static int biToDec(int[] binary) {
        int decimal = 0;
        int length = binary.length;

        for (int i = 0; i < length; i++) {
            decimal += binary[i] * Math.pow(2, length - 1 - i);
        }
        return decimal;
    }
}