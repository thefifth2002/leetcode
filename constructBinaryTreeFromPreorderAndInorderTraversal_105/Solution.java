package constructBinaryTreeFromPreorderAndInorderTraversal_105;

public class Solution {
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    return helper(preorder, 0, inorder, 0, inorder.length - 1);
  }
  private TreeNode helper(int[] preorder, int preStart,
      int[] inorder, int inStart, int inEnd) {
    if (preStart > preorder.length - 1 || inStart > inEnd) {
      return null;
    }
    TreeNode root = new TreeNode(preorder[preStart]);
    int inId = 0;
    for (int i = inStart; i <= inEnd; i++) {
      if (inorder[i] == root.val) {
        inId = i;
        break;
      }
    }
    root.left = helper(preorder, preStart + 1, inorder, inStart, inId -1);
    root.right = helper(preorder, preStart + inId - inStart + 1,
        inorder, inId + 1, inEnd);
    return root;
  }
}
