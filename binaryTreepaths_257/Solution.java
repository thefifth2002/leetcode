package binaryTreepaths_257;

import java.util.ArrayList;
import java.util.List;

import treeSetUp.TreeNode;

public class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> paths = new ArrayList<>();
    if (root != null) {
      helper(root, "", paths);
    }
    return paths;
  }

  private void helper(TreeNode root, String path, List<String> paths) {
    if (root.left == null && root.right == null) {
      paths.add(path + root.val);
    }
    if (root.left != null) {
      helper(root.left, path + root.val + "->", paths);
    }
    if (root.right != null) {
      helper(root.right, path + root.val + "->", paths);
    }
  }
}
