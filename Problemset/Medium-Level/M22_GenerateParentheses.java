// https://leetcode.com/problems/generate-parentheses
import java.util.*;

public class M22_GenerateParentheses {
  public static void main(String[] args) {
    int example1InputN = 4;
    List<String> example1Output = new ArrayList<>();
    example1Output.add("((()))");
    example1Output.add("(()())");
    example1Output.add("(())()");
    example1Output.add("()(())");
    example1Output.add("()()()");
    
    List<String> answer = solution(example1InputN);

    // System.err.println(example1Output.toString());
    System.err.println(answer.toString());
  }

  /**
   * Step:
   * - Kita buat variabel untuk pembuka dan penutup sebagai batas jumlah braket / kurung
   * - Deklarasi list string untuk menampung hasil semua
   * - Buat string builder untuk menyimpan data pembuatan kurung
   * - Kita memanggil fungsi tambahan untuk melakukan rekursif pembuatan braket
   * - Cara kerja fungsi tambahan 
   * - Kondisi awal ketika nilai open & close = 0 artinya sudah selesai membuat kombinasi yang dimana
   *   kita masukan ke List utama
   * - Kondisi selanjutnya adalah ketika open > 0 artinya kita membuat untuk kurung buka, kita menambahkan
   *   kurung buka "(" kemudian kita panggil lagi fungsinya dengan nilai open - 1
   *   Hasil:
   *   => (((
   *   => ((
   *   => (
   *   Setelah memanggil fungsinya kita hapus 1 kurung buka dari belakang
   * - Kemudian sama untuk kurung tutup ")"
   *   => )))
   *   => ))
   *   => )
   * - Kembalikan list string
   * @param n
   * @return
   */
  public static List<String> solution(int n) {
    int open = n, close = n;
    List<String> parenthese = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    generateParenthese(open, close, sb, parenthese);
    return parenthese;
  }
  
  private static void generateParenthese(int open, int close, StringBuilder sb, List<String> parenthese) {
    if(open == 0 && close == 0) {
      parenthese.add(sb.toString());
      return;
    }
    if(open > 0) {
      sb.append("(");
      generateParenthese(open-1, close, sb, parenthese);
      sb.deleteCharAt(sb.length() - 1);
    }
    if(close > open) {
      sb.append(")");
      generateParenthese(open, close-1, sb, parenthese);
      sb.deleteCharAt(sb.length() - 1);
    }
  }
}