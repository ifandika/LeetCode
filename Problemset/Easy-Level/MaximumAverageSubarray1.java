// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value
// and return this value. Any answer with a calculation error less than 10-5 will be accepted.
// 
public class MaximumAverageSubarray1 {
	public double solution(int[] nums, int k) {
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

	// Otehr solution
	public double findMaxAverage(int[] nums, int k) {
    int sm=0;
    for(int i=0;i<k;i++) sm+=nums[i];
    int i=k;
    int j=0;
    double avg=sm/(double)k;
    while(i<nums.length){
        sm+=nums[i];
        sm-=nums[j];
        avg=Math.max(avg,sm/(double)k);
        i++;
        j++;
    }
    return avg;
   }
}