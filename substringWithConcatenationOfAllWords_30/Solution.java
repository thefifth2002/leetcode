package substringWithConcatenationOfAllWords_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
  public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> ans = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    HashMap<String, Integer> wordMap = new HashMap<>();
    HashMap<String, Integer> stringMap = new HashMap<>();
    if (s == null || words == null || s.length() == 0) {
      return ans;
    }
    int wordLen = words[0].length();
    int wordCount = words.length;
    for (String word : words) {
      wordMap.put(word,
          wordMap.containsKey(word) ? wordMap.get(word) + 1 : 1);
    }
    for (int i = 0; i <= s.length() - wordLen * wordCount; i++) {
      String after = s.substring(i >= wordLen ? i - wordLen : 0, i);
      String before = s.substring(i + wordLen * wordCount - wordLen,
          i + wordLen * wordCount);
      if (after.equals(before)) {
        if (set.contains(i - wordLen)) {
          ans.add(i);
          set.add(i);
        }
        continue;
      }
      stringMap.clear();
      int j = 0;
      for (; j < wordCount; j++) {
        int k = i + j * wordLen;
        String subs = s.substring(k, k + wordLen);
        if (!wordMap.containsKey(subs) ||
            stringMap.get(subs) == wordMap.get(subs)) {
          break;
        }
        stringMap.put(subs,
          stringMap.containsKey(subs) ? stringMap.get(subs) + 1 : 1);
      }
      if (j == wordCount) {
        ans.add(i);
        set.add(i);
      }
    }
    return ans;
  }
}
