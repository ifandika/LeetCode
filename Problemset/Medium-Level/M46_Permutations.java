/**
 * https://leetcode.com/problems/permutations
 * 
 * - Diberikan nilai [1,2,3]
 * - Buat semua kemungkinan dari nilai
 * - Output = [[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1]]
 * 
 * Klu
 * - Permutasi & Kombinasi dalam matematika
 * - Nilai awal diturak dengan semua jenis nilai selain nilai awal
 */

import java.util.*;

public class M46_Permutations {
    public static void main(String[] args) {
        // Test-1
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = solution(nums);
        System.out.println(result);
    }

    /**
     * 
     */
    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(result, nums, new ArrayList<>());
        return result;
    }

    /**
     * - ambil panjang array untuk batas jelajah
     * - jika ukuran {@code tempList} = panjang array maka kita masukan hasil {@code tempList} ke {@code list}
     * - jika tidak kita for dari 0 - panjang array
     * - lalu kita cek jika {@code tempList} berisi nilai array {@code nums} maka kita lompati karena kita perlu kombinasi
     * - lalu masukan {@code nums} ke {@code tempList}
     * - lalu rekursif kita panggil fungsi lagi, karena kombinasi jadi kita mulai dari awal, dan jika nilai sudah dimasukan kita lewati
     *   untuk kita ambil nilai selanjutnya
     * - 
     */
    public static void permutation(List<List<Integer>> list, int[] nums, ArrayList<Integer> tempList) {
        int length = nums.length;
        if(tempList.size() == length) {
            System.out.println(" = "+tempList);
            list.add(new ArrayList<Integer>(tempList));
        }
        else {
            for(int i = 0; i < length; i++) {
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                permutation(list, nums, tempList);
                System.out.println("=> "+tempList.get(tempList.size() - 1));
                tempList.remove(tempList.size() - 1); // Remove same/duplicate number
            }
        }
    }
}