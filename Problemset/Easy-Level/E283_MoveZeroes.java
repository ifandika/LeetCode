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
     * - Gunakan 2 pointer untuk kiri & kanan (depan & belakang)
     * - Perulangan dari 0 - length
     * - Lalu cek jika nilai depan bukan 0 maka kita tukar dengan nilai left (belakang)
     * - Lakukan swap nilai
     * - Lakukan hingga akhir
     */
    public static void solution(int[] nums) {
        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            if(nums[right] != 0) {
                int swap = nums[right];
                nums[right] = nums[left];
                nums[left] = swap;
                left++;
            }
        }
    }
}