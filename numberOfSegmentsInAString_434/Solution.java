package numberOfSegmentsInAString_434;

public class Solution {
  public int countSegments(String s) {
    s = s.trim();
    int ln = s.length();
    int i = 0;
    int cnt = 0;
    while (i < ln) {
      System.out.println("i = " + i + " char = " + s.charAt(i));
      while (i < ln && s.charAt(i) != ' ') {
        i++;
      }
      cnt++;
      i++;
      while (i < ln && s.charAt(i) == ' ') {
        i++;
      }
    }
    return cnt;
  }
  public static void main(String[] args) {
    String s = "a, b, c";
    String s1 = "Hello, my, name is John";
    Solution sol = new Solution();
    System.out.println(sol.countSegments(s));
    System.out.println(sol.countSegments(s1));

  }
}
