package removeNthNodeFromEndOfList_19;

public class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode fP = dummy;
    ListNode sP = dummy;
    for (int i = 0; i <= n; i++) {
      fP = fP.next;
    }
    while (fP != null) {
      fP = fP.next;
      sP = sP.next;
    }
    sP.next = sP.next.next;
    return dummy.next;
  }
  public static void main(String[] args) {
    Solution sol = new Solution();
  }
}
