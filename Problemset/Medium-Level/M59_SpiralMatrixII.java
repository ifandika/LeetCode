import java.util.*;

public class M59_SpiralMatrixII {
  public static void main(String[] args) {
    int input1N = 3;
    int[][] output1 = {
      {1,2,3}, {8,9,4}, {7,6,5}
    };
    int[][] result = solution(input1N);

    System.out.println("Input \t: "+input1N);
    System.out.println("Output \t: "+Arrays.deepToString(output1));
    System.out.println("Result \t: "+Arrays.deepToString(result));
  }

  /**
   * Step:
   * - Kita cek jika kurang dari 1 maka kita kembalika nilai 1
   * - Kita buat array matrix 2D baru dengan ukuran n x n
   * - Lakukan travesal dari sisi atas, kanan, bawah, kiri dan seterusnya kemudian berikan nilai
   * - Kembalikan (resturn) nilai matrix
   * @param n
   * @return
   */
  public static int[][] solution(int n) {
    int[][] result = new int[n][n];
    if(n <= 1) {
      result[0][0] = 1;
      return result;
    }
    int size = n * n;
    int number = 1;
    int line = 0, column = 0;
    int up = 1,
        right = 2,
        down = 3,
        left = 4;
    int direction = right;
    int upWall = 0,
        rightWall = n,
        downWall = n,
        leftWall = -1;
    
    while(size >= 0) {
      if(direction == right) {
        while(column < rightWall) {
          result[line][column] = number++;
          column += 1;
        }
        line += 1;
        column -= 1;
        rightWall -= 1;
        direction = down;
      }
      else if(direction == down) {
        while(line < downWall) {
          result[line][column] = number++;
          line += 1;
        }
        line -= 1;
        column -= 1;
        downWall -= 1;
        direction = left;
      }
      else if(direction == left) {
        while(column > leftWall) {
          result[line][column] = number++;
          column -= 1;
        }
        line -= 1;
        column += 1;
        leftWall += 1;
        direction = up;
      }
      else {
        while(line > upWall) {
          result[line][column] = number++;
          line -= 1;
        }
        line += 1;
        column += 1;
        upWall += 1;
        direction = right;
      }
      size--;
    }

    return result;
  }
}
