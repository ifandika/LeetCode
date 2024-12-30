/**
 * https://leetcode.com/problems/smallest-even-multiple
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E2413_SmallestEvenMultiple {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }

    /**
     * 
     */
    public static int solution(int n) {
        if(n % 2 != 0) return n * 2;
        return n;
    }
}