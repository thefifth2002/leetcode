package longestCommonPrefix_14;

public class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0 || strs == null) {
      return "";
    }

    int minlen = strs[0].length();
    for (int i = 0; i < strs.length; i++) {
     minlen = Math.min(minlen, strs[i].length());
    }

    int counter = 0;
    while (counter < minlen) {
      char common = strs[0].charAt(counter);
      for (int i = 0; i < strs.length; i++) {
        if (strs[i].charAt(counter) != common) {
          return strs[0].substring(0, counter);
        }
      }
      counter++;
    }
    return strs[0].substring(0, counter);
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    String[] strings = {"flower", "flow", "fleet"};
    System.out.println(sol.longestCommonPrefix(strings));
  }
}
