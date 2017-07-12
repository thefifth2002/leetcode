package excelSheetColumnNumber;

public class Solution {
  public int titleToNumber(String s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
      int tmp = s.charAt(i) - 64;
      sum += tmp;
    }
    return sum;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println('A' - 64);
    System.out.println('B' - 64);
    System.out.println('C' - 64);
    System.out.println(sol.titleToNumber("Z"));

  }
}
