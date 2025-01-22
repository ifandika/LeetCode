/**
 * https://leetcode.com/problems/combination-sum-ii/
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class M40_CombinationSumII {
  public static void main(String[] args) {
    int[] candidates = {10,1,2,7,6,1,5};
    int target = 8;

    List<List<Integer>> res = solution(candidates, target);
    for(List<Integer> l : res) {
      System.out.println(l.toString());
    }
  }

  /**
   * - Menggunakan metode brute force/backtracking
   * - Kemungkinan nilai dengan gambaran tree
   * - Seperti merge sort (Pecah per pecah)
   * 
   */
  public static List<List<Integer>> solution(int[] candidates, int target) {
    List<List<Integer>> list = new LinkedList<List<Integer>>();
    Arrays.sort(candidates);
    backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
    return list;
  }

  private static void backtrack(List<List<Integer>> answer, List<Integer> tempList, int[] candidates, int target, int index) {
    if (target < 0) {
      return;
    }
    else if (target == 0) { // Add to the answer array, if the sum is equal to target.
      answer.add(new ArrayList<>(tempList));
    }
    else {
      for (int i = index; i < candidates.length && target >= candidates[i]; i++) {
        if (i > index && candidates[i] == candidates[i - 1]) {
          continue;
        }
        // Add it to tempList.
        tempList.add(candidates[i]);
        // Check for all possible scenarios.
        backtrack(answer, tempList, candidates, target - candidates[i], i + 1);
        // Backtrack the tempList.
        tempList.remove(tempList.size() - 1);
      }
    }
  }
}