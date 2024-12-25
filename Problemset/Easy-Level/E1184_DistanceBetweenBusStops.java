/**
 * 
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E1184_DistanceBetweenBusStops {
    public static void main(String[] args) {
        int[] distance = {1,2,3,4};
        int start = 0,
            destination = 3;

        int result = solution(distance, start, destination);
        System.out.println("TestCase-1: "+result);
    }

    /**
     * 
     */
    public static int solution(int[] distance, int start, int destination) {
        if(start == destination) {
            return 0;
        }

        final int N = distance.length; 
        int d = distance[start],
            right = Integer.MAX_VALUE,
            i = (start + 1) % N;

        while(i != start) {
            if(i == destination) {
                right = d;
                d = 0;
            }

            d += distance[i++];
            i %= N;
        }
        System.out.println("z : "+d+" - "+right);
        return Math.min(d, right);
    }
}