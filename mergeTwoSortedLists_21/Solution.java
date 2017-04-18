package mergeTwoSortedLists_21;

public class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode merged = new ListNode(0);
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    if (l1.val <= l2.val) {
      merged = l1;
      merged.next = mergeTwoLists(l1.next, l2);
    } else {
      merged = l2;
      merged.next = mergeTwoLists(l1, l2.next);
    }
    return merged;
  }
}
