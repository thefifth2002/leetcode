package lowestCommonAncestorOfABinarySearchTree_235;

public class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    while ((root.val - p.val) * (root.val - q.val) > 0) {
      root = root.val > p.val ? root.left : root.right;
    }
    return root;
  }
  public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
    if (root.val > p.val && root.val > q.val) {
      return lowestCommonAncestor1(root.left, p, q);
    } else if (root.val < p.val && root.val < q.val) {
      return lowestCommonAncestor1(root.right, p. q);
    } else {
      return root;
    }
  }
}
