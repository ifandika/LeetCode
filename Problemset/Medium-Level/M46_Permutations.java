import java.util.*;

public class M46_Permutations {
  public static void main(String[] args) {
    // Example 1
    int[] input1Nums = { 1, 2, 3 };
    List<List<Integer>> output1Nums = List.of(
      List.of(1,2,3),
      List.of(1,3,2),
      List.of(2,1,3),
      List.of(2,3,1),
      List.of(3,1,2),
      List.of(3,2,1)
    );

    List<List<Integer>> result = solution(input1Nums);
    System.out.println("Input \t: "+Arrays.toString(input1Nums));
    System.out.println("Output \t: "+output1Nums.toString());
    System.out.println("Result \t: "+result.toString());
  }

  // Solution 1
  /**
   *
   */
  public static List<List<Integer>> solution(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    oprtSolution(result, nums, new ArrayList<>());
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
   */
  public static void oprtSolution(List<List<Integer>> list, int[] nums, ArrayList<Integer> tempList) {
    int length = nums.length;
    if(tempList.size() == length) {
      list.add(new ArrayList<Integer>(tempList));
    }
    else {
      for (int i = 0; i < length; i++) {
        if (tempList.contains(nums[i])) continue;
        tempList.add(nums[i]);
        oprtSolution(list, nums, tempList);
        tempList.remove(tempList.size() - 1); // Remove same/duplicate number
      }
    }
  }

  // Solution 2
  public static List<List<Integer>> solution2(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    boolean[] freq = new boolean[nums.length];
    oprtSolution2(nums, ans, temp, freq);
    return ans;
  }

  public static void oprtSolution2(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] freq) {
    if(temp.size() == nums.length) {
      ans.add(new ArrayList<>(temp));
      return;
    }
    for(int i = 0; i < nums.length; i++) {
      if(!freq[i]) {
        freq[i] = true;
        temp.add(nums[i]);
        oprtSolution2(nums, ans, temp, freq);
        temp.remove(temp.size() - 1);
        freq[i] = false;
      }
    }
  }
}
