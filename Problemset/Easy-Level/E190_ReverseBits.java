import java.util.*;
import java.math.*;

public class E190_ReverseBits {
  public static void main(String[] args) {
    int input1N = 43261596;
    int output1N = 964176192;
    int result = solution(input1N);
    System.err.println("Input    : "+input1N);
    System.err.println("Expected : "+output1N);
    System.err.println("Ouput    : "+result);
  }

  /**
   * Step:
   * - Kita konversi ke dalam biner dengan langsung merverse jadi ketika konversi sudah terbalik, ketika konversi kita gunakan
   *   format string 32 bit, kemudian kita ganti string kosong dengan nilai 0
   * - Kita konversi lagi kedalam desimal dengan perulangan dari belakang dan kita gunakan fungsi matematika pangkat Math.pow()
   * - Kita kembalikan nilai desimal hasil konversi
   * @param n
   * @return
   */
  public static int solution(int n) {
    StringBuilder sb = new StringBuilder(
      String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0")
    );
    sb.reverse();
    char[] binary = sb.toString().toCharArray();
    int decimalReverse = 0;
    int order = 0;
    for(int index = binary.length-1; index >= 0; index--) {
      if(binary[index] == '1') {
        decimalReverse += Math.pow(1 * 2, order);
      }
      order++;
    }
    return decimalReverse;
  }
  
  public static int solution2(int n) {
    int res = 0;
    for (int i=0; i<32; i++){
      res = (res<<1) + ((n>>i)&1);
    }
    return res;
  }
}