package longestSubstringWithoutRepeatingCharacters_3;

import java.util.HashMap;

public class Solution {


  public int lengthOfLongestSubstring1(String s) {
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

  public int lengthOfLongestSubstring(String s) {
    if (s == null) {
      return 0;
    }

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    int max = 0;
    int start = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (!map.containsKey(c)) {
        map.put(c, i);
      } else {
        max = Math.max(max, map.size());
        while (map.containsKey(c)) {
          map.remove(s.charAt(start));
          start++;
        }
        map.put(c, i);
      }
    }
    max = Math.max(max, map.size());
    return max;
  }
}
