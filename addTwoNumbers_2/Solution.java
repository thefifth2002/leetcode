package addTwoNumbers_2;

/*
 * while one of the list still have elements in it, keep scan through the list
 * carrier = previous carrier + l1 + l2
 * get the val of new list but / 10
 * get the new carrier by % 10
 * create new node with the carrier
 * after scan two list if still have any carrier left, make new node
 * 
 * new to create two node, make them equal like result = i, so we can use i to move forward
 * and return result.
 */
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
}
