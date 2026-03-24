import java.util.*;

public class E1002_FindCommonCharacters {
  public static void main(String[] args) {
    String[] words = { "bella", "label", "roller" };
    List<String> result = solution2(words);
    System.out.println("Result \t: " + result.toString());
  }

  /**
   * Step:
   * - Buat variabel objek List dari string kosong
   * - Cek kondisi jika panjang = 1 maka kita kembalikan nilai words tersebut
   * - Deklarasi HashMap untuk menyimpan frekuensi nilai dari Char & Integer
   * - Buat perulangan dari 0 - jumlah data
   * - Cek kondisi untuk kata apakah sudah dimasukan, jika belum kita masukan dan
   * jika sudah kita tambah nilai frekuensi-nya, lakukan hingga akhir kata
   * - Kemudian kita masukan kata dengan nilai frekuensi paling besar pada List
   * string
   * - Kembalikan list string tersebut
   * @param words
   * @return
   */
  public static List<String> solution(String[] words) {
    List<String> result = new ArrayList<>();
    int length = words.length;
    if (length == 1) {
      result.add(words[0]);
      return result;
    }
    HashMap<Character, Integer> frequency = new HashMap<>();
    for (int i = 0; i < length; i++) {
      String word = words[i];
      for (int j = 0; j < word.length(); j++) {
        char c = word.charAt(j);
        if (!frequency.containsKey(c)) {
          frequency.put(c, 1);
        } else {
          frequency.replace(c, frequency.get(c) + 1);
        }
      }
    }
    for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
      char ch = entry.getKey();
      int freq = entry.getValue();
      for (int j = 0; j < freq; j++) {
        result.add(String.valueOf(ch));
      }
    }
    return result;
  }

  public static List<String> solution2(String[] words) {
    List<String> result = new ArrayList<>();

    int[] minFreq = new int[26];
    for (char c : words[0].toCharArray()) {
      minFreq[c - 'a']++;
    }
    for (int i = 1; i < words.length; i++) {
      int[] currFreq = new int[26];
      for (char c : words[i].toCharArray()) {
        currFreq[c - 'a']++;
      }
      for (int j = 0; j < 26; j++) {
        minFreq[j] = Math.min(minFreq[j], currFreq[j]);
      }
    }

    for (int i = 0; i < 26; i++) {
      for (int j = 0; j < minFreq[i]; j++) {
        result.add(String.valueOf((char) ('a' + i)));
      }
    }
    return result;
  }

}
