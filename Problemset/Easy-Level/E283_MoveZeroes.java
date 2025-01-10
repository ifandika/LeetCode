/**
 * https://leetcode.com/problems/move-zeroes
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E283_MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        solution(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * - bisa tukar dengan nilai yang akan kita pindahkan
     * - jika nilai < 1 dan nilai 0 maka return
     * 
     */
    public static void solution(int[] nums) {
        int l = nums.length;
        int end = l-1;
        int zeroExits = 0;
        for (int i = 0; i < l; i++) {
            if(nums[i] < 1) {
                zeroExits = 1;
                break;
            }
        }
        if(zeroExits < 1) {
            return;
        }
        Arrays.sort(nums);
        for (int i = 0; i < l; i++) {
            if(nums[i] < 1 && i <= end) {
                int swap = nums[i];
                nums[i] = nums[end];
                nums[end] = swap;
                end--;
            }
        }
        Arrays.sort(nums, 0, end+1);
    }
}