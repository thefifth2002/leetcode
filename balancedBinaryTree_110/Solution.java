package balancedBinaryTree_110;

import treeSetUp.TreeNode;

public class Solution {
  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }
    return Math.abs(depth(root.left) - depth(root.right)) <= 1
        && isBalanced(root.left) && isBalanced(root.right);
  }

  private int depth(TreeNode node) {
    if (node == null) {
      return 0;
    } else {
      return 1 + Math.max(depth(node.left), depth(node.right));
    }
  }
}
