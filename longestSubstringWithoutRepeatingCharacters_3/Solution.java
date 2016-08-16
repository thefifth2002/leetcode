package longestSubstringWithoutRepeatingCharacters_3;

import java.util.HashMap;

public class Solution {


  public int lengthOfLongestSubstring(String s) {
    if (s == null) {
      return 0;
    }
    char[] charArray = s.toCharArray();
    int maxLength = 0;
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < charArray.length; i++) {
      if (!map.containsKey(charArray[i])) {
        map.put(charArray[i], i);
      } else {
        maxLength = Math.max(maxLength, map.size());
        i = map.get(charArray[i]);
        map.clear();
      }
    }
    return maxLength = Math.max(maxLength, map.size());
  }
}
