package combinationSumIII_216;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> lists = new ArrayList<>();
    backtrack(lists, new ArrayList<>(), n, 1, k);
    return lists;
  }
  private void backtrack(List<List<Integer>> lists, List<Integer> comb,
      int remain, int start, int count) {
    if (comb.size() == count && remain == 0) {
      lists.add(new ArrayList<>(comb));
    } else {
      for (int i = start; i <= 9; i++) {
        comb.add(i);
        backtrack(lists, comb, remain - i, i + 1, count);
        comb.remove(comb.size() - 1);
      }
    }
  }
}
