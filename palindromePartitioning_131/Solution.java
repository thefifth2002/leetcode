package palindromePartitioning_131;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<String>> partition(String s) {
    List<List<String>> lists = new ArrayList<>();
    backtrack(lists, new ArrayList<>(), s, 0);
    return lists;
  }
  private void backtrack(List<List<String>> lists, List<String> list,
      String s, int start) {
    if (start == s.length()) {
      lists.add(new ArrayList<>(list));
    } else {
      for (int i = start; i < s.length(); i++) {
        if (isPalidrome(s, start, i)) {
          list.add(s.substring(start, i + 1));
          backtrack(lists, list, s, i + 1);
          list.remove(list.size() - 1);
        }
      }
    }
  }
  private boolean isPalidrome(String s, int lo, int hi) {
    while (lo < hi) {
      if (s.charAt(lo) != s.charAt(hi)) {
        return false;
      }
      lo++;
      hi--;
    }
    return true;
  }
}
