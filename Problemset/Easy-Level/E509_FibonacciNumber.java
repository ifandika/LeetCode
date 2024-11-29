/**
 * https://leetcode.com/problems/fibonacci-number
 * 
 * 
 * 
 */

import java.util.*;

public class E509_FibonacciNumber {
    public static void main(String[] args) {
        
    }

    /**
     * 
     * 
     */
    public static int solution(int n) {
        if(n = 1) return 1;
        if(n <= 0) return 0;
        return solution(n-1) + solution(n-2);
    }

    /**
     * Ultimate Solution
     */
    public static int solution(int n) {
        if (n < 2) return n;

        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2; 
        double psi = (1 - sqrt5) / 2; 

        double fibN = (Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5;

        return (int)Math.round(fibN);
    }
}