import java.util.*;
import java.io.*;
import java.math.*;

class ListNode {
	int val;
	ListNode next;

	ListNode() {}

	ListNode(int val) { 
		this.val = val; 
	}

	ListNode(int val, ListNode next) { 
		this.val = val; this.next = next; 
	}
}

public class Main {

	public static void main(String[] args) {
		// ListNode head = new ListNode(0);
		// head.next = new ListNode(0);
		// head.next.next = new ListNode(1);
		// head.next.next.next = new ListNode(2);
		// head.next.next.next.next = new ListNode(3);
		// head.next.next.next.next.next = new ListNode(3);
		// head.next.next.next.next.next.next = new ListNode(4);

		// head = solution2(head);
		// while(head != null) {
		// 	System.out.println(head.val);
		// 	head = head.next;
		// }
		// int[] n = {1,12,-5,-6,50,3};
		// String s = "abcde", goal = "cdea";

		int[] n = {1,1,4,2,1,3};

		System.out.println(solution(n));
	}

	public static int solution(int[] heights) {
		int length = heights.length;
		int[] heightSorted = new int[length];
		clone(heightSorted, heights);
		Arrays.sort(heightSorted);
		int count = 0;
		for(int i = 0; i < length; i++) {
			if(heightSorted[i] != heights[i]) {
				count++;
			}
		}
		return count;
	}

	public static void clone(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
	}

	// public static boolean solution2(String s, String goal) {
	// 	if(s.length() == goal.length()) {
	// 		String merge = (s+s);
	// 		if(merge.contains(goal)) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }

	// public static double solution(int[] nums, int k) {
	// 	double sum = 0d;
	// 	if(nums.length > k) {
	// 		for(int i = 0; i <= k; i++) {
	// 			int t = nums[i];
	// 			if(t > 1 || t < 0) {
	// 				sum += t;
	// 			}
	// 		}
	// 		return (sum /= k);
	// 	}
	// 	else {
	// 		for(int i = 0; i < nums.length; i++) {
	// 			sum += nums[i];
	// 		}
	// 		return (sum /= k);
	// 	}
	// }

	// public static ListNode solution2(ListNode head) {
	// 	int value = head.val;
	// 	ListNode buffer = head;
	// 	while(buffer != null) {
	// 		int hVal = head.val;
	// 		if(hVal != value && value >= 0) {
	// 			value = hVal;
	// 		}
	// 		else if(value == hVal) {
	// 			hVal = -1;
	// 		}
	// 		buffer = buffer.next;
	// 	}
	// 	return head;
	// }
}