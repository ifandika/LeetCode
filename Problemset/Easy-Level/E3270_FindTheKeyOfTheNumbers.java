/**
 * https://leetcode.com/problems/find-the-key-of-the-numbers
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E3270_FindTheKeyOfTheNumbers {
    public static void main(String[] args) {
        int num1 = 987, num2 = 879, num3 = 798;
        System.out.println(solution(num1, num2, num3));
    }

    /**
     * 
     */
    public static int solution(int num1, int num2, int num3) {
        return (
            Math.min(num1/1000, Math.min(num2/1000, num3/1000)) * 1000 +
            Math.min(num1/100 % 10, Math.min(num2/100 % 10, num3/100 % 10)) * 100 +
            Math.min(num1/10 % 10, Math.min(num2/10 % 10, num3/10 % 10)) * 10 +
            Math.min(num1 % 10, Math.min(num2 % 10, num3 % 10))
        );
    }
}