import java.util.*;

public class M1461_CheckStringContainsAllBinaryCodes {
  public static void main(String[] args) {
    String example1InputS = "00110110";
    int example1InputK = 2;
    boolean example1Output = true;
    
    String example2InputS = "0110";
    int example2InputK = 1;
    boolean example2Output = true;
    
    String example3InputS = "0110";
    int example3InputK = 2;
    boolean example3Output = false;

    System.err.println(solution(example1InputS, example1InputK));
  }

  /**
   * Step
   * - Kita sub-string data dengan panjang k dan simpan dalam array
   * - Kita konversi dalam int
   * - Kita rubah kedalam desimal dari biner
   * - Cek nilai jika ada 0, 1, ... benar
   * - Jika tidak salah
   * @param s
   * @param k
   * @return
   */
  public static boolean solution(String s, int k) {
    ArrayList<String> binaryData = new ArrayList<>();
    for (int i = 0; i < s.length(); i += k) {
      binaryData.add(s.substring(i, i + k));
    }
    for (String val : binaryData) {
      int decimalNumber = Integer.parseInt(val, 2);
    }
    return false;
  }
}
