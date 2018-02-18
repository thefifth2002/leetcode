package p671secondMinimumNodeInABinaryTree;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int findSecondMinimumValue(TreeNode root) {
    Set<Integer> set = new HashSet<>();
    dfs(root, set);
    int min = root.val;
    int secMin = Integer.MAX_VALUE;
    for (int n : set) {
      if (n > min) {
        secMin = Math.min(n, secMin);
      }
    }
    return secMin < Integer.MAX_VALUE ? secMin : -1;
  }

  private void dfs(TreeNode root, Set<Integer> set) {
    if (root != null) {
      set.add(root.val);

    }
  }
}
