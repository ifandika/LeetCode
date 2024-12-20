/**
 * https://leetcode.com/problems/clear-digits
 * 
 */

import java.util.*;

public class E3174_ClearDigits {
    public static void main(String[] args) {
        String s = "cb43";
        System.out.println(solution(s));
    }

    /**
     * - Pertama buat StringBuilder untuk menampung nilai string
     * - Variabel untuk panjang string
     * - Jelajah dari 0 - panjang string s
     * - Ambil karakter dari string dengan charAt()
     * - Jika {@code c} adalah nilai (0 <= c <= 9), Karena yang kita masukan di
     *   StringBuilder adalah huruf saya, jadi ketika kita cek string ada bilangan
     *   kita harus 1 huruf di StringBuilder
     * - Jika bukan bilangan kita masukan {@code c, sb.append(c)}
     * - Lalu kita kambalikan StringBuilder ke String {@code return sb.toString()}
     */
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if(c >= '0' && c <= '9') {
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}