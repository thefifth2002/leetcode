package p290_wordPattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public boolean wordPattern(String pattern, String str) {
    String[] strList = str.split(" ");
    if (pattern.length() != strList.length) {
      return false;
    }
    Map<Character, String> map = new HashMap<>();
    Map<String, Character> revMap = new HashMap<>();
    for (int i = 0; i < pattern.length(); i++) {
      char key = pattern.charAt(i);
      String value = strList[i];
      if (map.containsKey(key)) {
        if (!map.get(key).equals(value)) {
          return false;
        }
      } else {
        if (revMap.containsKey(value)) {
          return false;
        } else {
          map.put(key, value);
          revMap.put(value, key);
        }
      }
    }
    return true;
  }
}
