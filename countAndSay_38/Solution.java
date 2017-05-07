package countAndSay_38;

public class Solution {
  public String countAndSay(int n) {
    StringBuilder cur = new StringBuilder("1");
    StringBuilder pre = new StringBuilder();
    int count;
    char say;
    for (int i = 1; i < n; i++) {
      pre = cur;
      cur = new StringBuilder();
      count = 1;
      say = pre.charAt(0);
      for (int j = 1; j < pre.length(); j++) {
        char c = pre.charAt(j);
        if (c != say) {
          cur.append(count).append(say);
          count = 1;
          say = c;
        } else {
          count++;
        }
      }
      cur.append(count).append(say);
    }
    return cur.toString();
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.countAndSay(1));
  }
}
