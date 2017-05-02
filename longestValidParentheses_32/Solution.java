package longestValidParentheses_32;

import java.util.Stack;

public class Solution {
  public int longestValidParentheses(String s) {
    Stack<Integer> stack = new Stack<>();
    int maxLen = 0;
    if (s.length() < 2) {
      return 0;
    }
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
      } else {
        if (!stack.empty()) {
          if (s.charAt(stack.peek()) == '(') {
            stack.pop();
          } else {
            stack.push(i);
          }
        } else {
          stack.push(i);
        }
      }
    }
    System.out.println(stack.toString());
    System.out.println("stack size = " + stack.size());
    if (stack.empty()) {
      return s.length();
    } else {
      int begin;
      int end = s.length();
      while (!stack.empty()) {
        begin = stack.pop();
        System.out.println("begin = " + begin);
        int temp = end - begin - 1;
        System.out.println("temp len = " + temp);
        maxLen = Math.max(maxLen, temp);
        System.out.println("maxLen = " + maxLen);
        end = begin;
      }
      maxLen = Math.max(maxLen, end);
    }
    return maxLen;
  }
  public int longestValidParentheses2(String s) {
    int maxLen = 0;
    Stack<Integer> stack = new Stack<>();
    int left = -1;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
      } else {
        if (stack.empty()) {
          left = i;
        } else {
          stack.pop();
          if (stack.empty()) {
            maxLen = Math.max(maxLen, i - left);
          } else {
            maxLen = Math.max(maxLen, i - stack.peek());
          }
        }
      }
    }
    return maxLen;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
//    System.out.println(sol.longestValidParentheses("(()"));
//    System.out.println(sol.longestValidParentheses(")("));
//    System.out.println(sol.longestValidParentheses (")(())))()"));
    System.out.println(sol.longestValidParentheses ("())"));
  }
}
