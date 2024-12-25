/**
 * https://leetcode.com/problems/defanging-an-ip-address
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class E1108_DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        address = solution(address);
        System.out.println(address);
    }

    /**
     * - Buat StringBuilder untuk kita tampung hasil
     * - Kita split/pecah String dengan regex = . (titik)
     * - Kita ambil panjang array string split
     * - Lakukan perulangan dari 0 - length
     * - Setiap i kita masukan nilai array string split ke StringBuilder
     * - Lalu kita masukan string "[.]" tetapi dengan syarat jika i != length karena kita
     *   tidak memasukan yang bagian akhri juga
     * - Lalu kembalikan StringBuilder dalam bentuk string
     */
    public static String solution(String address) {
        StringBuilder sb = new StringBuilder();
        String[] split = address.split("\\.");
        int length = split.length;
        for(int i = 0; i < length; i++) {
            sb.append(split[i]);
            if(i != length-1) {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}