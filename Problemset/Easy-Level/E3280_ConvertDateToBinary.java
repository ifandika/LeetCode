/**
 * https://leetcode.com/problems/convert-date-to-binary
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E3280_ConvertDateToBinary {
    public static void main(String[] args) {
        
    }

    /**
     * - Kita deklarasi StringBuilder untuk hasil
     * - Perulangan untuk elemen yyy, mm, dd
     * - Lalu masukan ke dalam StringBuilder Integer.toBinaryString
     * - Lalu masukan "-"
     * - Terakhir kita hapus '-' yang terkakhir (yyyy-mm-dd-)
     * - Lalu kembalikan ke toString()
     */
    public static String void solution(String date) {
        StringBuilder sb = new StringBuilder();
        for(String s : date.split("-")){
            sb.append(Integer.toBinaryString(Integer.parseInt(s)));
            sb.append("-");
        }
        // Remove last "-"
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
