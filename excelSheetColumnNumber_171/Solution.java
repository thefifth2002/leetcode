package excelSheetColumnNumber_171;

public class Solution {
  public int titleToNumber(String s) {
    int num = 0;
    int ln = s.length();
    for (int i = 0; i < s.length(); i++) {
      num = num * 26 + s.charAt(i) - 64;
    }
    return num;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.titleToNumber("A"));
    System.out.println(sol.titleToNumber("Z"));
    System.out.println(sol.titleToNumber("AA"));
    System.out.println(sol.titleToNumber("AB"));
  }
}
