import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M54_SpiralMatrix {
  public static void main(String[] args) {
    int[][] input1Matrix = {
      {1,2,3}, {4,5,6}, {7,8,9}
    };
    List<Integer> output1Matrix = List.of(1,2,3,6,9,8,7,4,5);

    System.out.println("Input 1 \t: "+Arrays.deepToString(input1Matrix));
    System.out.println("Output 1 \t: "+output1Matrix.toString());
    System.out.println("Result 1 \t: "+solution(input1Matrix).toString());
  }

  /**
   * Step:
   * - Lakukan penjelajahan nilai dari atas-kanan -> kanan-bawah -> bawah-kiri -> kiri-atas -> kiri-kanan ..
   * - Buat pembatas dari pejelajahan tersebut yaitu ATAS, KANAN, BAWAH, KIRI
   * - Lakukan perulangan dengan kondisi m*n (size matrix)
   * - Kita tambahkan nilai array matrix penjelajahan ke variabel hasil
   * - Sederhananya kita cuma melakukan travesal dari sisi atas, kanan, bawah, kiri & seterusnya, ada variabel wall
   *   / tembok untuk batas loop-nya, ketika kita melakukan travesal
   *   => sisi atas : naikan nilai kolom (j++)
   *   => sisi kanan : naikan nilai baris (i++)
   *   => sisi bawah : naikan nilai kolom (j++)
   *   => sisi kiri : naikan nilai kolom (i++)
   * @param matrix
   * @return
   */
  public static List<Integer> solution(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int size = m * n;
    int i = 0, j = 0;
    List<Integer> result = new ArrayList<>();

    int up = 0,
        right = 1,
        down = 2,
        left = 3;
    
    int direction = right;
    
    int upWall = 0,
        rightWall = n,
        downWall = m,
        leftWall = -1;
    
    while(result.size() != size) {
      if(direction == right) {
        while(j < rightWall) {
          result.add(matrix[i][j]);
          j += 1;
        }
        i += 1;
        j -= 1;
        rightWall -= 1;
        direction = down;
      }
      else if (direction == down) {
        while(i < downWall) {
          result.add(matrix[i][j]);
          i += 1;
        }
        i -= 1;
        j -= 1;
        downWall -= 1;
        direction = left;
      }
      else if (direction == left) {
        while(j > leftWall) {
          result.add(matrix[i][j]);
          j -= 1;
        }
        i -= 1;
        j += 1;
        leftWall += 1;
        direction = up;
      }
      else {
        while(i > upWall) {
          result.add(matrix[i][j]);
          i -= 1;
        }
        i += 1;
        j += 1;
        upWall += 1;
        direction = right;
      }
    }
    return result;
  }
}
