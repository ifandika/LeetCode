
public class BinarySearch {
	public int solution(int[] nums, int target) {
		int first = 0,
				last = (nums.length - 1),
				mid;
		while(first <= last) {
			mid = ((first + last) / 2);
			if(nums[mid] == target) {
				return mid;
			}
			if(nums[first] == target) {
				return first;
			}
			if(nums[last] == target) {
				return last;
			}
			else if(target > nums[mid]) {
				first = (mid + 1);;
			}
			else {
				last = (mid - 1);
			}
		}
		return -1;
	}
}