// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than 
// ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3

// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
import java.util.*;

public class E169_MajorityElement {
	public int solution(int[] nums) {
		int length = nums.length;
		if(nums == null || length == 0) {
			return -1;
		}
		else if(length == 1) {
			return nums[0];
		}
		int count = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < length; i++) {
			if(hm.containsKey(nums[i])) {
				count = (hm.get(nums[i]) + 1);
				if(count > (length / 2)) {
					return nums[i];
				}
				else {
					hm.put(nums[i], count);	
				}
			}
			else {
				hm.put(nums[i], 1);
			}
		}
		return -1;
	}
}