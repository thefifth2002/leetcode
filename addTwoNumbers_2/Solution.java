package addTwoNumbers_2;

public class Solution {
  public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
    ListNode i = new ListNode(0);
    ListNode result = i;
    int carrier = 0;
    while (l1 != null || l2 != null) {
      if (l1 != null) {
        carrier += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        carrier += l2.val;
        l2 = l2.next;
      }
      i.val = carrier % 10;
      carrier = carrier / 10;
      if (l1 != null || l2 != null) {
        i.next = new ListNode(0);
        i = i.next;
      }
    }
    if (carrier > 0) {
      i.next = new ListNode(carrier);
    }
    return result;
  }
  
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode i = new ListNode(0);
    ListNode result = i;
    while (l1 != null || l2 != null) {
      if (l1 != null) {
        i.val += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        i.val += l2.val;
        l2 = l2.next;
      }
      if (l1 != null || l2 != null) {
        i.next = new ListNode(i.val / 10);
        i.val %= 10;
        i = i.next;
      }
    }
    if (i.val > 10) {
      i.next = new ListNode(i.val);
    }
    return result;
  }
}
