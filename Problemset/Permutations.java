/**
 * - Diberikan nilai [1,2,3]
 * - Buat semua kemungkinan dari nilai
 * - Output = [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]
 * 
 * Solution step
 * 
 */

public class Permutations {

    public List<List<Integer>> solution(int[] nums) {
        if (l == r) {
            if (!String.valueOf(str).contains("AB"))
                System.out.print(String.valueOf(str) + " ");
            return;
        } 
        for(int i = l; i <= r; i++) {
            char tmp = str[l];
            str[l] = str[i];
            str[i] = tmp;
             
            permute(str, l + 1, r);
             
            tmp = str[l];
            str[l] = str[i];
            str[i] = tmp;
        }
    }
}