/**
 * https://leetcode.com/problems/sum-of-good-numbers/
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E3452_SumOfGoodNumbers {
  public static void main(String[] args) {
    int[] nums = [1,3,2,1,5,4];
    int k = 2;

    int res = solution()
  }

  /**
   * 
   */
  public static int solution(int[] nums, int k) {
    int sum = 0;
    int length = nums.length;

    for(int i = 0; i < nums.length; i++) {
      if(i == 0 && nums[i] > nums[i+1] || i == length-1 && nums[i] > nums[i-1]) {
        sum += nums[i];
      }
      else if(nums[i] >  nums[i-1] && nums[i] > nums[i+1]) {
        sum += nums[i];
      }
    }
    return sum;
  }
}