/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
 * 
 */

import java.util.*;
import java.io.*;
import java.math.*;
import static java.lang.System.*;

public class E1221_SplitAStringInBalancedStrings {
  public static void main(String[] args) {
    String s = "RLRRLLRLRL";
    String s2 = "RLRRRLLRLL";

    int res = solution(s2);
    out.println(res);
  }

  /**
   * - Variabel indikator l, r & total
   * - Perulangan dari 0 - panjang s
   * - ambil karakter dari string
   * - cek jika c == L dengan nilai l = r maka total kita naikan
   * - cek jika c == R dengan nilai l = r maka total kita naikan
   * - Lalu cek jika nilai c saat ini = R atau L maka naikan r & l
   * - terakhir kita kembalikan total
   */
  public static int solution(String s) {
    int l = 0, r = 0, total = 0;
    for(int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if(c == 'L' && l == r) {
        total++;
        l = 0;
        r = 0;
      }
      else if(c == 'R' && l == r) {
        total++;
        l = 0;
        r = 0;
      }
      
      if(c == 'R') {
        r++;
      }
      if(c == 'L') {
        l++;
      }
    }
    return total;
  }

  // More simple
  /**
   * Sama seperti solusi di atas namun lebih sederhana
   */
  public static int solution2(String s) {
    int l = 0, r = 0, total = 0;
    char[] c = s.toCharArray();
    for(int i = 0; i < s.length(); i++) {
      if(c[i] == 'L') {
        l++;
      }
      else {
        r++;
      }

      if(l == r) {
        total++;
      }
    }
    return total;
  }
}