package maximalRectangle_85;

import java.util.Stack;

public class Solution {
  public int maximalRectangle1(char[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[] height = new int[cols + 1];
    height[cols] = 0;
    int max = 0;
    for (int row = 0; row < rows; row++) {
      Stack<Integer> stack = new Stack<>();
      for (int col = 0; col <= cols; col++) {
        if (col < cols) {
          if (matrix[row][col] == '1') {
            height[col] += 1;
          } else {
            height[col] = 0;
          }
        }
        if (stack.isEmpty() || height[stack.peek()] <= height[col]) {
          stack.push(col);
        } else {
          while (!stack.isEmpty() && height[col] < height[stack.peek()]) {
            int top = stack.pop();
            int area = height[top]
                * (stack.isEmpty() ? col : col - stack.peek() - 1);
            max = Math.max(max, area);
          }
          stack.push(col);
        }
      }
    }
    return max;
  }
  public static void main(String[] args) {
    char[][] matrix = {{'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'},
        {'1', '1', '1', '1', '1'},
        {'1', '0', '0', '1', '0'}};
    char[][] m2 = {{'1', '0'},{'1', '0'}};
    Solution sol = new Solution();
    System.out.println(sol.maximalRectangle1(matrix));
//    System.out.println(sol.maximalRectangle(m2));
  }
}
