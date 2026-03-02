/**
 * https://leetcode.com/problems/longest-common-prefix
 *
 * Diberikan string array 's' tentukan total kata yang sama di setiap string array
 *
 * # Contoh 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * # Contoh 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Penjelasan: There is no common prefix among the input strings.
 *
 */

import java.util.*;

public class E14_LongestCommonPrefix {
  public static void main(String[] args) {}

  public static String solution(String[] str) {
    if (str == null || str.length == 0) return "";
    String prefix = str[0];
    for (String s : str) {
      // while (s.indexOf(str) != 0) {
      //   prefix = prefix.substring(0, prefix.length() - 1);
      // }
    }
    return prefix;
  }

  public static String solution2(String[] strs) {
    // Base condition
    int length = strs.length;
    if (strs == null || length == 0) return "";
    if (length == 1) return strs[0];

    Arrays.sort(strs);
    String s1 = strs[0];
    String s2 = strs[length - 1];
    
    int index = 0;
    int s1L = s1.length();
    int s2L = s2.length();

    while(index < s1L && index < s2L) {
      if(s1.charAt(index) == s2.charAt(index)) {
        index++;
      }
      else {
        break;
      }
    }
    return s1.substring(0, index);
  }
}
