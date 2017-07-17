package convertSortedArrayToBinarySearchTree_108;

import treeSetUp.TreeNode;

public class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null) {
      return null;
    }
    TreeNode root = insert(nums, 0, nums.length - 1);
    return root;
  }
  private TreeNode insert(int[] nums, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = start + (end - start) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = insert(nums, start, mid - 1);
    node.right = insert(nums, mid + 1, end);
    return node;
  }
}
