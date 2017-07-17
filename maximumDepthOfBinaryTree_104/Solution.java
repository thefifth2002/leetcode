package maximumDepthOfBinaryTree_104;

import treeSetUp.TreeNode;

public class Solution {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxhDepth(root.right));
  }
}
