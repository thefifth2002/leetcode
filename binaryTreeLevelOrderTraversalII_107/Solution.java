package binaryTreeLevelOrderTraversalII_107;

import java.util.LinkedList;
import java.util.List;

import treeSetUp.TreeNode;

public class Solution {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    List<List<Integer>> ll = new LinkedList<>();
    levelToList(ll, root, 0);
    return ll;
  }

  private void levelToList(List<List<Integer>> ll, TreeNode root, int level) {
    if (root == null) {
      return;
    }
    if (level >= ll.size()) {
      ll.add(0, new LinkedList<Integer>());
    }
    levelToList(ll, root.left, level + 1);
    levelToList(ll, root.right, level + 1);
    ll.get(ll.size() - 1 - level).add(root.val);
  }
}
