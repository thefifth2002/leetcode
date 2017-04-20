package mergeKSortedLists_23;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    ListNode merged = new ListNode(0);
    ListNode start = merged;
    PriorityQueue<ListNode> queue =
        new PriorityQueue<ListNode>(new Comparator<ListNode>(){
          @Override
          public int compare(ListNode l1, ListNode l2) {
            return Integer.compare(l1.val, l2.val);
          }
        });
    for (ListNode node: lists) {
      if (node != null) {
        queue.add(node);
      }
    }
    while (!queue.isEmpty()) {
      start.next = queue.poll();
      start = start.next;
      if (start.next != null) {
        queue.add(start.next);
      }
    }
    return merged.next;
  }
}
