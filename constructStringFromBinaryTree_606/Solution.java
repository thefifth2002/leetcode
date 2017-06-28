package constructStringFromBinaryTree_606;

public class Solution {
  public String tree2str(TreeNode t) {
    if (t == null) {
      return "";
    }
    String str = t.val + "";
    String left = tree2str(t.left);
    String right = tree2str(t.right);
    if (left == "" && right == "") {
      return str;
    }
    if (left == "") {
      return str + "()" + "(" + right + ")";
    }
    if (right == "") {
      return str + "(" + left + ")";
    }
    return str + "(" + left + ")" + "(" + right + ")";
  }
}
