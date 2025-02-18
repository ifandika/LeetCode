/**
 * https://leetcode.com/problems/valid-parentheses/
 *
 */

import java.util.*;

public class E20_ValidParentheses {
  public static void main(String[] args) {
    String s1 = "(())[{}]";
    System.out.println(solution(s1));
  }

  public static boolean solution(String s) {
    int length = s.length();
    if (length % 2 != 0) {
      return false;
    }
    Stack<Character> stack = new Stack<>();
    int l = s.length();
    for (int i = 0; i < l; i++) {
      char c = s.charAt(i);
      if (stack.isEmpty()) {
        if (c == '}' || c == ']' || c == ')') {
          return false;
        } else {
          stack.push(c);
        }
      } else if (c == '{' || c == '[' || c == '(') {
        stack.push(c);
      } else if ((stack.peek() == '{' && c != '}') ||
                (stack.peek() == '[' && c != ']')  ||
                (stack.peek() == '(' && c != ')')) {
        return false;
      } else {
        stack.pop();
      }
    }
    return stack.size() == 0;
  }
}