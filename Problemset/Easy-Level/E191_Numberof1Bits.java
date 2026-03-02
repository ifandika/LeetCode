import java.util.*;

public class E191_Numberof1Bits {
  public static void main(String[] args) {
    int input1N = 11;
    int expected1 = 3;

    System.err.println("Input N  : "+input1N);
    System.err.println("Expected : "+expected1);
    System.err.println("Result   : "+solution3(input1N));
  }

  /**
   * Step:
   * - Kita buat variabel untuk nilai jumlah bit 1
   * - Lakukan perulangan untuk konversi ke biner
   * - Lakukan operasi modulo dengan modulo 2 dan cek jika hasil nilai biner 1 maka indikator bits 1 kita naikan
   * - Kemudian kita bagi dengan 2, jadi hanya menghitung nilai bit 1 saja
   * - Kemudian kembalikan variabel jumlah bits 1
   * @param n
   * @return
   */
  public static int solution(int n) {
    int bits1 = 0;
    while(n > 0) {
      if(n % 2 == 1) {
        bits1++;
      }
      n /= 2;
    }
    return bits1;
  }

  /**
   * Step:
   * - Cukup gunakan fungsi bitCount() yang ada pda class Integer, dimana fungsi ini untuk menghitung jumlah bit 1
   * @param n
   * @return
   */
  public static int solution2(int n) {
    return Integer.bitCount(n);
  }

  /**
   * Brian Kernighan Algorithm
   * Step:
   * - Loping / perulangan sebanyak jumlah bit 1, jadi tidak semua bit
   * - Logikanya adalah dengan menghapus bit 1 dari kanan setiap perulangan jadi ketika nilai bit 1 habis
   *   maka otomatis berhenti karena kondisi n != 0, jika nilai biner saja 0 maka desimalnya juga 0
   * - Variabel count untuk menghitung jumlah bit 1
   * @param n
   * @return
   */
  public static int solution3(int n) {
    int count = 0;
    while(n != 0) {
      n &= (n - 1);
      count++;
    }
    return count;
  }
}