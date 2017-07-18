package binaryTreeTilt_563;

import treeSetUp.TreeNode;

public class Solution {
  public int tilt;
  public int findTilt(TreeNode root) {
    sum(root);
    return tilt;
  }

  private int sum(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = sum(root.left);
    int right = sum(root.right);
    tilt += Math.abs(left - right);
    return left + right + root.val;
  }
}
