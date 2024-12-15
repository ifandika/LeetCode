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
        if(length % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < length; i++) {
            char word = s.charAt(i);
            if(word == '{' || word == '[' || word == '(') {
                stack.push(word);
            }
            else {
                if(stack.isEmpty()) {
                    stack.push(word);
                }
                else {
                    if(stack.peek() != '{' && word == '}'
                        || stack.peek() != '[' && word == ']'
                        || stack.peek() != '(' && word == ')') {
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}