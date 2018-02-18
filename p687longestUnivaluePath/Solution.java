package p687longestUnivaluePath;

public class Solution {
  private int res;
  public int longestUnivaluePath(TreeNode root) {
    if (root == null) {
      return 0;
    }
    this.res = 0;
    helper(root);
    return this.res;
  }
  private int helper(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = helper(root.left);
    int right = helper(root.right);
    int leftPath = 0;
    int rightPath = 0;
    if (root.left != null && root.left.val == root.val) {
      leftPath = left + 1;
    }
    if (root.right != null && root.right.val == root.val) {
      rightPath = right + 1;
    }
    this.res = Math.max(this.res, leftPath + rightPath);
    return Math.max(leftPath, rightPath);
  }
}
