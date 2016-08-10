package longestSubstringWithoutRepeatingCharacters_3;

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    if (s == null) {
      return 0;
    }
    
    char[] charArray = s.toCharArray();
    int maxLength = 0;
    String sub = "";
    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        sub = s.substring(i,j);
      }
    }
    return 0;
  }
}
