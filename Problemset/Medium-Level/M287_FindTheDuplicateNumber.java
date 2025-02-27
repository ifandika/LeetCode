/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class M287_FindTheDuplicateNumber {
  public static void main(String[] args) {
      
  }

  /**
   * - Diberikan array int, berisi bilangan bulat positif, duplikat
   * - Temukan nilai duplikat
   * - Kembalikan nilai tunggal yang duplikat
   * - Tantangan tanpa harus membuat array baru
   */
  public static int solution(int[] nums) {
    int length = nums.length;
    if(length < 1) {
      return nums[0];
    }
    Arrays.sort(nums);
    for(int i = 0; i < length-1; i++) {
      if(nums[i] == nums[i+1]) {
        return nums[i];
      }
    }
    return -1;
  }
}