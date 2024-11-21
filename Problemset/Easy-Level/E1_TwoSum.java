import java.util.*;

/**
 * https://leetcode.com/problems/two-sum/description/
 * 
 * Two Sum
 * 
 * Solution:
 * 
 */
public class E1_TwoSum {
	public static void main(String[] args) {
		int[] num = {1, 3, 4};
		int target = 5;
		
		int[] res = solution(num, target);

		System.out.println(Arrays.toString(res));
	}

	public static int[] solution(int[] arr, int target) {
		int length = arr.length;
		for(int i = 0; i < length; i++) {
			for(int k = i+1; k < length; k++) {
				if(arr[i] + arr[k] == target) {
					return new int[]{i, k};
				}
			}
		}
		return null;
	}
}