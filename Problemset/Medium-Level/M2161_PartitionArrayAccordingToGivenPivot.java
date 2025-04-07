/**
 * https://leetcode.com/problems/partition-array-according-to-given-pivot/
 */

import java.io.*;
import java.math.*;
import java.util.*;

public class M2161_PartitionArrayAccordingToGivenPivot {
  public static void main(String[] args) {

  }

  /**
   *
   */
  public static int[] solution(int[] nums, int pivot) {
    int[] result = new int[nums.length];
    int left = 0, right = nums.length - 1;

    for(int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
      if(nums[i] < pivot) {
        result[left] = nums[i];
        left++;
      }
      if(nums[j] > pivot) {
        result[right] = nums[j];
        right--;
      }
    }

    while(left <= right) {
      result[left] = pivot;
      left++;
    }

    return result;
  }
}
