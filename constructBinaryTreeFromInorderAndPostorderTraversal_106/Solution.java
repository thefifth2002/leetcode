package constructBinaryTreeFromInorderAndPostorderTraversal_106;

public class Solution {
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    return helper(inorder, 0, inorder.length - 1,
        postorder, postorder.length - 1);
  }

  private TreeNode helper(int[] inorder, int inStart, int inEnd,
      int[] postorder, int postEnd) {
    if (inStart > inEnd) {
      return null;
    }
    TreeNode root = new TreeNode(postorder[postEnd]);
    int inId = 0;
    for (int i = inStart; i <= inEnd; i++) {
      if (root.val == inorder[i]) {
        inId = i;
        break;
      }
    }
    root.left = helper(inorder, inStart, inId - 1,
        postorder, postEnd - (inEnd - inId) - 1);
    root.right = helper(inorder, inId + 1, inEnd,
        postorder, postEnd - 1);
    return root;
  }
}
