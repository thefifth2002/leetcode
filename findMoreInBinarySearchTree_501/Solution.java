package findMoreInBinarySearchTree_501;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import treeSetUp.TreeNode;

public class Solution {
  private Map<Integer, Integer> map;
  private int max = 0;
  public int[] findMode(TreeNode root) {
    if (root == null) {
      return new int[0];
    }
    map = new HashMap<>();
    inorder(root);
    List<Integer> list = new LinkedList<>();
    for (int key : map.keySet()) {
      if (map.get(key) == max) {
        list.add(key);
      }
    }
    int[] modes = new int[list.size()];
    for (int i = 0; i < modes.length; i++) {
      modes[i] = list.get(i);
    }
    return modes;
  }
  private void inorder(TreeNode root) {
    if (root.left != null) {
      inorder(root.left);
    }
    map.put(root.val, map.getOrDefault(root.val, 0) + 1);
    max = Math.max(max, map.get(root.val));
    if (root.right != null) {
      inorder(root.right);
    }
  }
}
