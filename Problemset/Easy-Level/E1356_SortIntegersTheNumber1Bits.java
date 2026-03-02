import java.util.*;

public class E1356_SortIntegersTheNumber1Bits {
  public static void main(String[] args) {
    int[] example1InputArr = {
      0,1,2,3,4,5,6,7,8
    };
    int[] example1OutputArr = {
      0,1,2,4,8,3,5,6,7
    };
    int[] res = solution(example1InputArr);
    System.err.println("Input   : [0, 1, 2, 3, 4, 5, 6, 7, 8]");
    System.err.println("Output  : "+Arrays.toString(example1OutputArr));
    System.err.println("Result  : "+Arrays.toString(res));
  }

  /**
   * Step:
   * - *Menggunakan fungsi Integer.bitCount(x) 
   * - Pertama kita buat buat array integer objek dari array int primitif data yang dikirim, karena
   *   nantinya kita gunakan untuk bitCount dan menyimpan data hasil sorting bits, karena Arrays.sor() hanya
   *   mendukung array bertipe objek
   * - Kemudian kita paggil fungsi sort package Arrays, dimana pada logika sorting kita atur,
   *   pada parameter {temp} adalah array yang akan menapung hasil sorting, kemudian {(a, b) -> {...}}
   *   untuk logika sorting-nya, dimana kita mengambil nilai jumlah bit 1 dari a (nilai ke-2) dan b (nilai ke-1),
   *   lalu ada perbandingan {countA == countB} untuk jumlah bit 1 jika sama maka kita kembalikan {a - b}, disini
   *   kita hanya mengembalikan nilai positif atau negatif karena komparator hanya memerlukan hal tersebut
   *   
   *   Negatif (< 0)	a sebelum b
   *   Positif (> 0)	b sebelum a
   *   0	dianggap sama
   * 
   *   Jadi jika negatif nilai a akan ditempatkan sebelum b, jika positif maka yang b sebelum a jika 0 maka sama
   *   Contoh:
   *   a = 3
   *   b = 5
   *   a - b = -2 | Hasilnya adalah negatif, berarti 3 sebelum 5 => 3, 5
   *   
   * - Kemudian jika tidak kita kurangi yang nilai jumlah biner 1
   * - Kemudian for loop untuk memindahkan data hasil sortir
   * - Kembalikan array
   * @param arr
   * @return
   */
  public static int[] solution(int[] arr) {
    Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    Arrays.sort(temp, (a, b) -> {
      int countA = Integer.bitCount(a);
      int countB = Integer.bitCount(b);
      if(countA == countB) {
        return a - b;
      }
      return countA - countB;
    });
    for(int i = 0; i < arr.length; i++) {
      arr[i] = temp[i];
    }
    return arr;
  }
}
