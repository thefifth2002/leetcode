package largestRectangleInHistogram_84;

import java.util.Stack;

public class Solution {
  public int largestRectangleArea(int[] heights) {
    Stack<Integer> bars = new Stack<>();
    int ln = heights.length;
    int max = 0;
    for (int i = 0; i <= ln; i++) {
      int h = i == ln ? 0 : heights[i];
      if (bars.isEmpty() || h > heights[bars.peek()]) {
        bars.push(i);
        System.out.println("push " + i);
      } else {
        int top = bars.pop();
        System.out.println("pop " + top);
        max = Math.max(max, heights[top]
            * (bars.isEmpty() ? i : i - 1 - bars.peek()));
        i--;
        System.out.println("max = " + max);
      }
    }
    return max;
  }
  public static void main (String[] args) {
    Solution sol = new Solution();
    int[] heights = {2, 1, 5, 6, 2, 3};
    System.out.println(sol.largestRectangleArea(heights));
  }
}
