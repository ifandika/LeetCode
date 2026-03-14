import java.util.*;

public class E383_RansomNote {
  public static void main(String[] args) {
    String input1RasomNote = "aa";
    String input1Magazie = "aab";
    boolean output1 = true;

    System.err.println("rasomeNote \t : "+input1RasomNote);
    System.err.println("magazine \t : "+input1Magazie);
    System.err.println("Result \t \t : "+(solution(input1RasomNote, input1Magazie) == output1));
  }
  
  /**
   * Step:
   * - Deklarasi HashMap untuk menyimpan frekuensi nilai, tipe data char dan int
   *   a - 10
   *   b - 1
   *   ...
   * - Lakukan pengulangan dengan for-each untuk tipa kata, kemudian kita masukan kata ke HashMap dengan cek kata jika
   *   bukan kata (bilangan, simbol) maka kita berikan nilai 0 + 1
   * - Kemudian di perulangan selanjutnya kita bandingkan untuk huruf dan frekuiensinya dengan variabel rasomNote jika sama
   *   dan habis (HashMap kosong) maka berarti true, jika tidak maka kita returnkan false
   *   Dan jika nilai sama maka kita kurangi nilai frekuensi pada huruf tersebut
   * - Terakhir returnkan true
   * @param ransomNote
   * @param magazine
   * @return
   */
  public static boolean solution(String ransomNote, String magazine) {
    HashMap<Character, Integer> hashMapWord = new HashMap<>();

    for(char c : magazine.toCharArray()) {
      hashMapWord.put(c, hashMapWord.getOrDefault(c, 0) + 1);
    }

    for(char c : ransomNote.toCharArray()) {
      if(!hashMapWord.containsKey(c) || hashMapWord.get(c) == 0) {
        return false;
      }
      hashMapWord.put(c, hashMapWord.get(c) - 1);
    }

    return true;
  }
}
