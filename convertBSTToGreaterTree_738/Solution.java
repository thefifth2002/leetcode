package convertBSTToGreaterTree_738;

import treeSetUp.TreeNode;

public class Solution {
  int sum = 0;
  public TreeNode convertBST(TreeNode root) {
   converter(root);
   return root;
  }

  private void converter(TreeNode root) {
    if (root == null) {
      return;
    }
    converter(root.right);
    root.val += sum;
    sum = root.val;
    converter(root.left);
  }
}
