import java.util.Collections;
import java.util.Stack;

public class M79_WordSearch {
  public static void main(String[] args) {
    char[][] input1Board = {
        { 'A', 'B', 'C', 'E' },
        { 'S', 'F', 'C', 'S' },
        { 'A', 'D', 'E', 'E' }
    };
    String input1Word = "ABCCED";
    boolean output1Expected = true;

    System.out.println("Input 1-Board \t: " + input1Board.toString());
    System.out.println("Input 1-Word \t: " + input1Word);
    System.out.println("Input 1-Expected: " + output1Expected);
    System.out.println("Input 1-Result \t: " + solution2(input1Board, input1Word));
  }

  public static boolean solution(char[][] board, String word) {
    Stack<Character> words = new Stack<>();
    int m = board.length;
    int n = board[0].length;
    int existWord = 0;

    for (char tempWord : word.toCharArray()) {
      words.push(tempWord);
    }
    Collections.reverse(words);

    for (int lop1 = 0; lop1 < m; lop1++) {
      for (int lop2 = 0; lop2 < n; lop2++) {
        System.out.println("X: " + board[lop1][lop2]);
        if (words.contains(board[lop1][lop2])) {
          words.pop();
          existWord++;
          // Next
          if ((lop2 < n - 1) && words.contains(board[lop1][lop2 + 1])) {
            System.out.println("A: " + lop1 + " - " + lop2);
            continue;
          }
          // Down
          else if ((lop1 < m - 1) && words.contains(board[lop1 + 1][lop2])) {
            System.out.println("B: " + lop1 + " - " + lop2);
            lop2 = 0;
            lop2 = lop2 - 1;
            break;
          }
          // Back
          else if ((lop2 > 0) && words.contains(board[lop1][lop2 - 1])) {
            System.out.println("C: " + lop1 + " - " + lop2);
            lop2 = lop2 - 2;
            break;
          }
        }
      }
    }

    System.out.println(existWord);
    System.out.println(words.toString());
    return existWord == word.length();
  }

  public static boolean solution2(char[][] board, String word) {
    if (board == null || board.length == 0 || word == null || word.length() == 0) {
      return false;
    }

    // Store word in reverse using Stack (as requested)
    Stack<Character> wordStack = new Stack<>();
    for (int i = word.length() - 1; i >= 0; i--) {
      wordStack.push(word.charAt(i));
    }

    int rows = board.length;
    int cols = board[0].length;
    boolean[][] visited = new boolean[rows][cols];

    // Try to start from each cell
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (dfs(board, i, j, word, 0, visited)) {
          return true;
        }
      }
    }

    return false;
  }

  private static boolean dfs(char[][] board, int row, int col, String word, int index, boolean[][] visited) {
    // If all characters are matched
    if (index == word.length()) {
      return true;
    }

    // Check boundaries and if cell is already visited or doesn't match current
    // character
    if (row < 0 || row >= board.length || col < 0 || col >= board[0].length ||
        visited[row][col] || board[row][col] != word.charAt(index)) {
      return false;
    }

    // Mark current cell as visited
    visited[row][col] = true;

    // Explore adjacent cells (up, down, left, right)
    boolean found = dfs(board, row - 1, col, word, index + 1, visited) || // up
        dfs(board, row + 1, col, word, index + 1, visited) || // down
        dfs(board, row, col - 1, word, index + 1, visited) || // left
        dfs(board, row, col + 1, word, index + 1, visited); // right

    // Backtrack: unmark current cell
    visited[row][col] = false;

    return found;
  }

}
