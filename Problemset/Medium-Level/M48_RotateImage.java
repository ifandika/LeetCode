/**
 * https://leetcode.com/problems/rotate-image
 * 
 */

import java.util.*;

public class M48_RotateImage {
    public static void main(String[] args) {
        int[][] image = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        print2DArray(image);
        solution(image);
        print2DArray(image);
    }

	public static void solution(int[][] image) {
		int length = image.length;
        for (int i = 0; i < length / 2; i++) {
            int[] temp = image[i];
            image[i] = image[length - i - 1];
            image[length - i - 1] = temp;
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }   
        }
	}

    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}