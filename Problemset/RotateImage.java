/**
 * - Diberikan array 2D
 * - Putar array 90 derajat
 * - Input
 * 		{1, 2, 3},
 * 		{4, 5, 6},
 * 		{7, 8, 9}
 * - Output
 * 		{7, 4, 1},
 * 		{8, 5, 2},
 * 		{9, 6, 3}
 * 
 * Solusi
 * - Dengan cara Transponse matrix
 * - Lalu tukar nilai
 * 
 * Langkah-langkah
 * - Transponse matrix
 *  	{1, 2, 3},
 *  	{4, 5, 6},
 * 		{7, 8, 9}
 * - Tukar setiap nilai kolom dan baris
 * 		{1, 4, 7},
 * 		{2, 5, 8},
 * 		{3, 6, 9}
 * - Tukar 2 -> 3
 * - Tukar 3 -> 7
 * - Tukar 6 -> 8
 * - Lalu tukar lagi
 * 		{7, 4, 1},
 * 		{8, 5, 2},
 * 		{9, 6, 3}
 * - Tukar 1 -> 7
 * - Tukar 2 -> 8
 * - Tukar 3 -> 9
 */

import java.util.*;

public class RotateImage {

	public static void main(String[] args) {
		int[][] val = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		};
		int[][] val2 = {
			{5,1,9,11},
			{2,4,8,10},
			{13,3,6,7},
			{15,14,12,16}
		};
		r(val2);
		display(val2);
	}

	// Solusi 1
	static void rotateImage(int[][] matrix) {
		int length = matrix.length;
        for (int i = 0; i < length / 2; i++) { // Menukar nilai bawah dgn nilai atas
            int[] temp = matrix[i];
            matrix[i] = matrix[length - i - 1];
            matrix[length - i - 1] = temp;
        }
        for (int i = 0; i < length - 1; i++) { // Tukar dari nilai bagian kiri ke bagian kanan dan sebaliknya
            for (int j = i + 1; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
	}

	// Solusi 2
	static void r(int[][] matrix) {
		int length = matrix.length;
		for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < length; i++) {
			int temp = matrix[i][0];
			matrix[i][0] = matrix[i][length-1];
			matrix[i][length-1] = temp;
		}
	}

	static void display(int[][] val) {
		for(var x = 0; x < val.length; x++) {
			for(var z = 0; z < val.length; z++) {
				System.out.print(val[x][z]+", ");
			}
			System.out.println();
		}
	}
}