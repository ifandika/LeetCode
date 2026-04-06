import java.util.ArrayList;
import java.util.List;

public class M77_Combinations {
  public static void main(String[] args) {
    int input1N = 4;
    int input1K = 2;
    List<List<Integer>> output1 = List.of(
      List.of(1, 2),
      List.of(1, 3),
      List.of(1, 4),
      List.of(2, 3),
      List.of(2, 4),
      List.of(3, 4)
    );

    System.out.println("Input N \t: "+input1N);
    System.out.println("Input K \t: "+input1K);
    System.out.println("Output \t: "+output1.toString());
    System.out.println("Result \t: "+solution(input1N, input1K).toString());
  }
  
  public static List<List<Integer>> solution(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();
    combination(result, new ArrayList<>(), 1, n, k);
    return result;
  }

  public static void combination(List<List<Integer>> result, List<Integer> current, int start, int n, int k) {
    if(current.size() == k) {
      result.add(new ArrayList<>(current));
      return;
    }

    for(int loop = start; loop <= n; loop++) {
      current.add(loop);
      combination(result, current, (loop + 1), n, k);
      current.remove(current.size() - 1);
    }
  }
}
