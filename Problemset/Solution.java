import java.util.*;
import java.io.*;
import java.math.*;

public class Solution {
	public int solution(int[] heights) {
		int length = heights.length;
		int count = 0;
		if(length > 0) {
			int[] heightSorted = new int[length];
			clone(heightSorted, heights);
			Arrays.sort(heightSorted);
			for(int i = 0; i < length; i++) {
				if(heights[i] != heightSorted[i]) {
					count++;
				}
			}
		}
		return count;
	}

	public void clone(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
	}
}