/**
 * https://leetcode.com/problems/check-balanced-string
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E3340_CheckBalancedString {
    public static void main(String[] args) {
        String num = "23375191767127256746";
        System.out.println(solution(num));
    }

    /**
     * - Deklarasi variabel first : untuk penjumlahan nilai pertama, second : penjumlahan nilai kedua, counter :
     *   untuk indikator perpindahan penjumlahan
     * - Perulangan dari 0 - panjang string
     * - Lalu kita konversikan nilai string by postion (to char) ke int dengan char - '0'
     * - Lalu cek indikator dengan variabel counter
     * - Untuk pernjumlahan pertama kita first += n
     * - Untuk penjumlahan kedua second += n
     * - Lalu counter kita naikan
     * - Terakhir kita cek apakah nilai frist == second, jika iya maka string balance
     */
    public static boolean solution(String num) {
        int first = 0, second = 0, counter = 1;
        for(int i = 0; i < num.length(); i++) {
            int n = (num.charAt(i) - '0');
            if(counter % 2 != 0) {
                first += n;
            }
            else {
                second += n;
            }
            counter++;
        }
        return (first == second);
    }
}