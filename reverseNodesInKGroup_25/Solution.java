package reverseNodesInKGroup_25;

public class Solution {
  public ListNode reverseKGroup(ListNode head, int k) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy.next;
    int counter = 0;
    while (counter < k && current != null) {
      current = current.next;
      counter++;
    }
    if (counter == k ) {
      current = reverseKGroup(current, k);
      while (counter > 0) {
        ListNode temp = head.next;
        head.next = current;
        current = head;
        head = temp;
        counter--;
      }
      head = current;
    }
    return head;
  }
}
