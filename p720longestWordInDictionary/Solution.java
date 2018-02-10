package p720longestWordInDictionary;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
  public String longestWord(String[] words) {
    String res = "";
    Arrays.sort(words);
    Set<String> set = new HashSet<>();
    for (String w : words) {
      if (w.length() == 1 || set.contains(w.substring(0, w.length() - 1))) {
//        res = res.length() >= w.length() ? res : w;
        res = w.length() > res.length() ? w : res;
        set.add(w);
      }
    }
    return res;
  }
}
