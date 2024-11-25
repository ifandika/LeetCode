/**
 * https://leetcode.com/problems/merge-sorted-array/
 * 
 * 
 */

import java.util.*;

public class E88_MergeSortedArray {
    public static void main(String[] args) {
        // Test-1
        // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        // Output: [1,2,2,3,5,6]
        int[] nums1 = {1,2,3,0,0,0},
              nums2 = {2,5,6};

        solution2(nums1, 3, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 
     */
	public static void solution(int[] nums1, int m, int[] nums2, int n) {
		int[] sorted = new int[m+n];
		int index1 = 0,
			index2 = 0,
			index = 0;
            
		while(index1 < m || index2 < n) {
			if(nums1[index1] < nums2[index2]) {
				sorted[index++] = nums1[index1++];
			}
			else {
				sorted[index++] = nums2[index2++];	
			}
		}
	}

    /**
     * - Perulangan dari index m < nums1.length
     * - Masukan nilai dari nums2 ke nums1
     * - Kemudian sorting
     */
    public static void solution2(int[] nums1, int m, int[] nums2, int n) {
        for(int index = 0; index < n; index++) {
            nums1[m++] = nums2[index];
        }
        Arrays.sort(nums1);
    }
}