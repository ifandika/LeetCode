import java.lang.reflect.Array;
import java.util.*;

public class M49_GroupAnagrams {
  public static void main(String[] args) {
    String[] input1Strs = {
      "eat", "tea", "tan", "ate", "nat", "bat"
    };
    
    List<List<String>> result = solution(input1Strs);

    System.err.println(Arrays.toString(result.toArray()));
  }

  /**
   * Step:
   * - Deklarasi HashMap untuk menyimpan data dengan Kata kunci string dan List string
   * - Lakukan perulangan untuk setiap kata
   * - Ambil data dalam char array karena nanti akan di sortir dari A - Z
   * - Sortir array dengan class Arrays
   * - Ambil hasil sortir dalam bentuk string objek
   * - Cek jika kata yang kita sortir tidak ada dalam hashmap maka kita masukan ke data baru
   * - Jika ada kita ambil datanya by kata kunci kemudian kita tambahkan 
   * - Kita buat list dalam list untuk menampung semua data dengan map.values() untuk ambil data
   * - Kita sortir data list berdasarkan jumlah list dari sedikit ke banyak
   * Contoh:
   * From : [["ate", "tea", "eat"], ["bat"], ["nat", "tan"]]
   * To   : [["bat"], ["nat","tan"], ["ate","eat","tea"]]
   * @param strs
   * @return
   */
  public static List<List<String>> solution(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for(String word : strs) {
      char[] chars = word.toCharArray();
      Arrays.sort(chars);
      String sorted = new String(chars);

      if(!map.containsKey(sorted)) {
        map.put(sorted, new ArrayList<>());
      }
      map.get(sorted).add(word);
    }

    List<List<String>> result = new ArrayList<>(map.values());
    result.sort(Comparator.comparingInt(List::size));
    // result.sort((a, b) -> a.size() - b.size()); With lambda
    return result;
  }
}