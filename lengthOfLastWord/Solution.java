package lengthOfLastWord;

public class Solution {
  public int lengthOfLastWord(String s) {
    s = s.trim();
    int ln = s.length();
    int lastSpace = ln - 1;
    for (int i = ln - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        lastSpace = i;
        break;
      }
    }
    return lastSpace == ln - 1 ? s.length() : ln - 1 - lastSpace;
  }
  public static void main(String[] args) {
    String s = "b   a ";
    Solution sol = new Solution();
    System.out.println(sol.lengthOfLastWord(s));
  }
}
