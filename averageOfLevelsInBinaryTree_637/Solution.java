package averageOfLevelsInBinaryTree_637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import treeSetUp.TreeNode;

public class Solution {
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> avg = new ArrayList<>();
    Queue<TreeNode> que = new LinkedList<>();
    if (root == null) {
      return avg;
    }
    que.add(root);
    while (!que.isEmpty()) {
      double sum = 0.0;
      int ln = que.size();
      for (int i = 0; i < ln; i++) {
        TreeNode node = que.poll();
        sum += node.val;
        if (node.left != null) {
          que.offer(node.left);
        }
        if (node.right != null) {
          que.offer(node.right);
        }
      }
      avg.add(sum / ln);
    }
    return avg;
  }
}
