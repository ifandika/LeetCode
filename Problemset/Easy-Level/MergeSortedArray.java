

n1 = 1, 1, 2, 3, 
n2 = 2, 3, 4
Output
n1 = 1,1,2,2,3,3,4
if(n1 < n2)

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
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
}