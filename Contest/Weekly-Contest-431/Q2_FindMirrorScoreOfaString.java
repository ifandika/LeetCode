/**
 * 
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class Q2_FindMirrorScoreOfaString {
    public static void main(String[] args) {
        String s = "aczzx";
        System.out.println(solution(s));
    }

    /**
     * 
     */
    public static int solution(String s) {
       int n = s.length();
        int mirrorScore = 0;
        for (int i = 0; i < n / 2; i++) {
            mirrorScore += Math.abs(s.charAt(i) - s.charAt(n - 1 - i));
        }
        return mirrorScore;
    }
}