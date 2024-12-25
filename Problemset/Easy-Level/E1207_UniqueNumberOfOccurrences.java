/**
 * 
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E1207_UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(solution(arr));
    }

    /**
     * 
     */
    public static boolean solution(int[] arr) {
        int length = arr.length;
        if(length == 1 || (length == 2 && arr[0] != arr[1])) {
            return false;
        }
        Arrays.sort(arr);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < length; i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }
    }
}