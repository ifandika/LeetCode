import java.util.*;

public class E66_PlusOne {
  public static void main(String[] args) {
    int[] input1Digits = { 1, 2, 3 };
    int[] output1 = { 1, 2, 4 };
    int[] result1 = solution(input1Digits);

    System.out.println("Input 1 \t: " + Arrays.toString(input1Digits));
    System.out.println("Output 1 \t: " + Arrays.toString(output1));
    System.out.println("Result 1 \t: " + Arrays.toString(result1));
  }
  
  /**
   * Step:
   * - Lakukan perulangan dari nilai belakang hingga nilai awal / terdepan
   * - Cek nilai jika kurang dari 9 maka bisa kita naikan (+1)
   * - Jika tidak maka kita akan menambah digit baru, 9 => 1,0, jadi kita set digit terakhir ke 0 karena jika 9 + 1 = 10,
   *   1 akan ditempatkan ke paling depan dan 0 akan berada di paling belakang
   * @param digits
   * @return
   */
  public static int[] solution(int[] digits) {
    for (int index = digits.length - 1; index >= 0; index--) {
      if (digits[index] < 9) {
        digits[index]++;
        return digits;
      }
      digits[index] = 0;
    }
    
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }
}
