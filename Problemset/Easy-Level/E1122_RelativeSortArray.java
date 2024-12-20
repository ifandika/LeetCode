/**
 * https://leetcode.com/problems/relative-sort-array
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E1122_RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        arr1 = solution(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
    }

    /**
     * - Buat array baru untuk menampung array hasil
     * - variabel {@code l} untuk panjang {@code arr1}
     * - variabel {@code iSort} untuk index {@code sortArr}
     * - Sorting array {@code arr1} agar mudah mencari nilai yang sama dengan {@code arr2}
     * - Perulangan dari 0 - panjang {@code arr2}
     * - Perulangan dari 0 - panjang {@code l}
     * - Cek jika nilai {@code arr1 == arr2} kita masukan ke {@code sortArr}, lalu kita
     *   ubah nilai {@code arr1[i] = -1} agar penanda nilai ini sudah di masukan
     * - Perulangan lagi dari 0 - panjang {@code arr1} untuk memasukan nilai yang sisa di
     *   {@code arr1} yang kondisi nilai {@code arr1[i] != -1}
     * - Lalu kembalikan {@code return sortArr}
     */
    public static int[] solution(int[] arr1, int[] arr2) {
        int[] sortArr = new int[arr1.length];
        int l = arr1.length;
        int iSort = 0;

        Arrays.sort(arr1);

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < l; j++) {
                if(arr1[j] == arr2[i]) {
                    sortArr[iSort++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }

        for(int i = 0; i < l; i++) {
            if(arr1[i] != -1) {
                sortArr[iSort++] = arr1[i];
            }
        }
        return sortArr;
    }
}