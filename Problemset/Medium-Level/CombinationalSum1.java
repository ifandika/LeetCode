import java.util.*;
/**
[Problem]
Given an array of distinct integers candidates and a target integer target, 
return a list of all unique combinations of candidates where the chosen 
numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. 
Two combinations are unique if the frequency of at least one of the chosen
numbers is different.

The test cases are generated such that the number of unique combinations 
that sum up to target is less than 150 combinations for the given input.

[Example]
Example 1:
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:
Input: candidates = [2], target = 1
Output: []

[Constraints]
1 <= candidates.length <= 30
2 <= candidates[i] <= 40
All elements of candidates are distinct.
1 <= target <= 40
*/
public class CombinationSum1 {
	public static void main(String[] args) {
		// Example 1
		int[] arr = {2,3,5};
		int target = 8;
		List<List<Integer>> exam1 = solution(arr, target);
		
		exam1.forEach(System.out::println);
	}
	
	/**
	 * @param arr
	 * @param target
	 */
	public static List<List<Integer>> solution(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		solve(0, candidates, target, result, new ArrayList<Integer>());
		return result;
	}
	
	public static void solve(int index, int[] candidates, int target, List<List<Integer>> result, ArrayList<Integer> temp) {
		if(index == candidates.length) {
			if(target == 0) {
				result.add(new ArrayList<>(temp));
			}
			return;
		}
		if(candidates[index] <= target) {
			temp.add(candidates[index]);
			solve(index, candidates, (target-candidates[index]), result, temp);
			temp.remove(temp.size()-1);
		}
		solve(index+1, candidates, target, result, temp);
	}
}