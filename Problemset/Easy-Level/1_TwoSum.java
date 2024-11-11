import java.util.*;

public class TwoSum {
	public int[] solution(int[] arr, int target) {
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