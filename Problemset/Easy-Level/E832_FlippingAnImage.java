/**
 * https://leetcode.com/problems/flipping-an-image
 * 
 * - 2 Operasi Reverse & Invert
 * - Reverse membalikan nilai (Kiri ke kanan)
 * - Invert menukar nilai 1 menjadi 0 & 0 menjadi 1
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E832_FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };

        image = solution(image);

        System.out.println(Arrays.toString(image));

        int[][] image2 = {
            {1,1,0,0},
            {1,0,0,1},
            {0,1,1,1},
            {1,0,1,0}
        };

        image2 = solution(image2);

        System.out.println("\n"+Arrays.toString(image2));
    }

    /**
     * - Pertama kita reverse image
     * - Untuk baris array kita cek nilai, jika nilai = 0 ganti = 1
     *   jika nilai = 1 ganti = 0
     * - lalu kita swap/ganti/tukar posisi
     */
    public static int[][] solution(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            int[] rowImage = image[i];
            int l = rowImage.length;
            int iEnd = l-1;
            for(int j = 0; j < l/2; j++) {
                if(rowImage[j] == 1) {
                    rowImage[j] = 0;
                }
                else {
                    rowImage[j] = 1;
                }

                if(rowImage[iEnd] == 1) {
                    rowImage[iEnd] = 0;
                }
                else {
                    rowImage[iEnd] = 1;
                }

                int swap = rowImage[j];
                rowImage[j] = rowImage[iEnd];
                rowImage[iEnd--] = swap;
            }
            if(l % 2 != 0) {
                int mid = rowImage[l / 2];
                if(mid == 0) {
                    rowImage[l / 2] = 1;
                }
                else {
                    rowImage[l / 2] = 0;
                }
            }
        }
        return image;
    }
}