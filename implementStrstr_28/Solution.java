package implementStrstr_28;

public class Solution {
  public int strStr(String haystack, String needle){
    if (haystack.length() < needle.length()) {
      return -1;
    }
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      if (haystack.substring(i, i + needle.length()).equals(needle)) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.strStr("", ""));
  }
}
