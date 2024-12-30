/**
 * https://leetcode.com/problems/decode-the-message
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E2325_DecodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";

        System.out.println(solution(key, message));
    }

    /**
     * - Deklarasi HashMap untuk menyimpan nilai dari key yang dimana kita konversi ke 'a' - 'z'
     * - String Builder untuk kita susun dari nilai karakter pada arraylist
     * - Integer wordA = 97 dimana jika kita konversi ke char = 'a', lalu indexAl untuk index pengambilan
     *   nilai arraylist
     * - Pertama kita masukan key dengan nilai awal 'a' ke dalam hashmap
     * - Perulangan pertama dari 0 - panjang.key, kita ambil karakter pada string key kita masukan dalam
     *   char, kita cek jika char tidak kosong/spasi dan nilai pada HashMap tidak ada/belum pernah dimasukan,
     *   kita konversikan ke char dengan teknik casting (int), lalu masukan kedalam HashMap
     * - Perulangan dari 0 - panjang.message, ambil karakter string message dan cek jika tidak kosong maka
     *   kita ambil nilai dengan key dari HashMap dan kita masukan dalam StringBuilder, jika tidak kita tambahkan
     *   spasi/string kosong " "
     * - Lalu terakhir kita StringBuilder ke string (#toString())
     */
    public static String solution(String key, String message) {
        HashMap<Character, Character> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int wordA = 97;

        for(int i = 0; i < key.length(); i++) {
            char current = key.charAt(i);
            if(current != ' ' && !hm.containsKey(current)) {
                char ad = ((char)wordA++);
                hm.put(current, ad);
            }
        }
        for(int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);
            if(current != ' ') {
                sb.append(hm.get(current));
            }
            else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}