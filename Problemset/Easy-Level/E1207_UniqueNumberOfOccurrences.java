/**
 * 
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E1207_UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        // int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        int[] arr = {1,2,2,1,1,3};
        // int[] arr = {-4,3,3};
        System.out.println(solution(arr));
    }

    /**
     * 
     */
    public static boolean solution(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Set<Integer> s = new HashSet<>();
        for (int x : freq.values()) {
            s.add(x);
        }

        return freq.size() == s.size();



        // Arrays.sort(arr);
        // int[] v = new int[arr.length];
        // int idx = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     int cnt = 1;
        //     // Count occurrences of the current element
        //     while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
        //         cnt++;
        //         i++;
        //     }
        //     v[idx++] = cnt;
        // }
        // Arrays.sort(v);
        // for (int i = 1; i < v.length; i++) {
        //     if (v[i] == v[i - 1]) {
        //         return false;
        //     }
        // }
        // return true;


        // int length = arr.length;
        // if(length == 1 || (length == 2 && arr[0] != arr[1])) {
        //     return false;
        // }
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // int jumlah = 0, pointer = arr[0];
        // for(int i = 0; i < length-1; i++) {
        //     // int pov = (arr[i]*(-1)); To Positive
        //     if(Math.abs(arr[i]) == pointer) {
        //         jumlah++;
        //         if(Math.abs(arr[i+1]) != pointer && jumlah == pointer) {
        //             return true;
        //         }
        //     }
        //     else {
        //         pointer = Math.abs(arr[i]);
        //         jumlah = 1;
        //     }
        // }

        // return false;

        // HashMap<Integer, Integer> hm = new HashMap<>();
        // for(int i = 0; i < length; i++) {
        //     if(hm.containsKey(arr[i])) {
        //         hm.put(arr[i], 1);
        //     }
        //     else {
        //         hm.put(arr[i], 1);
        //     }
        // }
    }
}