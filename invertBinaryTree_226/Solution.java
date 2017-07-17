package invertBinaryTree_226;

import treeSetUp.TreeNode;

public class Solution {
  public TreeNode invertTree(TreeNode root) {
    invert(root);
    return root;
  }

  private void invert(TreeNode root) {
    if (root == null) {
      return;
    }
    invert(root.left);
    invert(root.right);
    TreeNode tmp = root.left;
    root.left = root.right;
    root.right = tmp;
  }
}
