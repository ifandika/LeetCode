/**
 * https://leetcode.com/problems/find-indices-of-stable-mountains
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E3285_FindIndicesOfStableMountains {
    public static void main(String[] args) {
        int height = [1,2,3,4,5], threshold = 2;

    }

    /**
     * 
     */
    public static List<Integer> solution(int[] height, int threshold) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < height.length; i++) {
            if(height[i - 1] > threshold) {
                list.add(i);
            }
        }
        return list;
    }
}