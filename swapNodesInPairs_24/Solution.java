package swapNodesInPairs_24;

public class Solution {
  public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode p = dummy;
    while (p.next != null && p.next.next != null) {
      ListNode first = p.next;
      ListNode second = p.next.next;
      first.next = second.next;
      p.next = second;
      second.next = first;
      p = p.next.next;
    }
    return dummy.next;
  }
}
