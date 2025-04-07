/**
 * https://leetcode.com/problems/transpose-matrix/
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E867_TransposeMatrix {
  public static void main(String[] args) {
    int[][] matrix = {
      {1,2,3}, {4,5,6}, {7,8,9}
    };
    matrix = solution(matrix);
  }

  /**
   * 
   */
  public static int[][] solution(int[][] matrix) {
    int length = matrix[0].length;
    if(length < 1) {
      return matrix;
    }
    for(int lop1 = 0; lop1 < length; lop1++) {
      for(int lop2 = 1; lop2 < length-1; lop2++) {
        int temp = matrix[lop1][lop2];
        matrix[lop1][lop2] = matrix[lop2][lop1];
        matrix[lop2][lop1] = temp;
        print2DArray(matrix);
        System.out.println();  
      }
    }
    return matrix;
  }

  public static void print2DArray(int[][] array) {
    for (int[] row : array) {
      for (int num : row) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }
}