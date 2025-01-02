/**
 * https://leetcode.com/problems/snake-in-matrix
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E3248_SnakeInMatrix {
    public static void main(String[] args) {
        int n = 3;
        List<String> commands = List.of("DOWN","RIGHT","UP");
        System.out.println(solution(n, commands));
    }

    /**
     * - Deklarasi untuk perintah
     * - perulangan 0 - panjang/total perintah
     * - variabel position untuk posisi
     * - Ambil nilai list, String c
     * - Kita cek perintah
     * - Jika perintah Ke atas, ke bawah kita tambahkan nilai n
     * - Jika nilai ke kiri = kurangi 1, jika ke kanan = tambah 1
     * - Kembalikan nilai position
     */
    public static int solution(int n, List<String> commands) {
        final String DOWN = "DOWN";
        final String UP = "UP";
        final String RIGHT = "RIGHT";
        final String LEFT = "LEFT";
        int position = 0;

        for(int i = 0; i < commands.size(); i++) {
            String c = commands.get(i);
            if(c.equals(UP)) {
                position -= n;
            }
            else if(c.equals(DOWN)) {
                position += n;
            }
            else if(c.equals(RIGHT)) {
                position += 1;
            }
            else if(c.equals(LEFT)) {
                position -= 1;
            }
        }
        return position;
    }
}