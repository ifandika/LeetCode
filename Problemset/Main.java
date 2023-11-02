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
		int[] n = {1,12,-5,-6,50,3};
		System.out.println(solution(new int[]{5}, 1));
	}

	public static double solution(int[] nums, int k) {
		double sum = 0d;
		if(nums.length > k) {
			for(int i = 0; i <= k; i++) {
				int t = nums[i];
				if(t > 1 || t < 0) {
					sum += t;
				}
			}
			return (sum /= k);
		}
		else {
			for(int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}
			return (sum /= k);
		}
	}

	public static ListNode solution2(ListNode head) {
		int value = head.val;
		ListNode buffer = head;
		while(buffer != null) {
			int hVal = head.val;
			if(hVal != value && value >= 0) {
				value = hVal;
			}
			else if(value == hVal) {
				hVal = -1;
			}
			buffer = buffer.next;
		}
		return head;
	}
}