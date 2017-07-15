package pathSum_112;
import treeSetUp.TreeNode;
public class Solution {
  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) {
      return false;
    }
    if (root.left == null && root.right == null && root.val == sum) {
      return true;
    }
    return hasPathSum(root.left, sum - root.val)
        || hasPathSum(root.right, sum - root.val);
  }
}
