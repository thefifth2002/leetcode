package keyRow_500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  public String[] findWords(String[] words) {
    String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < strs.length; i++) {
      for (char c : strs[i].toCharArray()) {
        map.put(c, i);
      }
    }
    List<String> oneRowWords = new ArrayList<>();
    for (String word : words) {
      int flag = map.get(word.toUpperCase().charAt(0));
      for (char c : word.toUpperCase().toCharArray()) {
        if (map.get(c) != flag) {
          flag = -1;
          break;
        }
      }
      if (flag != -1) {
        oneRowWords.add(word);
      }
    }
    return oneRowWords.toArray(new String[0]);
  }
}
