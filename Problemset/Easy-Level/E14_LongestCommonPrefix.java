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
    public static void main(String[] args) {
        
    }

	public static String solution(String[] str) {
		if(str == null || str.length == 0) return "";
        String prefix = s[0];
        for (String s : str) {
            while(s.indexOf(str) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
	}

    public static String solution2(String[] str) {
        // Base condition
        if(str == null || str.length == 0) return "";
        if(str.length == 1) return str[0];

        StringBuilder sb = new StringBuilder();
        int minLength = 0;

        // Cari panjang string terpendek
        for(String s : str) {
            minLength = Math.min(minLength, s.length());
        }

        for(int i = 0; i < minLength; i++) {
            HashMap<Character, Integer> hashMap = new HashMap<>();

            for(Sring s : str) {
                char c = s.charAt(i);
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
            }

            if(hashMap.size() == 1 && hashMap.value().iterator().next() == str.length) {
                sb.append(str[0].charAt(i));
            }
            else {
                break;
            }
        }

        return sb.toString();
    }
}