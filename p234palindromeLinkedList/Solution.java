package p234palindromeLinkedList;

public class Solution {
  public boolean isPalindrome(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    slow = reverse(slow);
    while (head != null && slow != null) {
      if (head.val != slow.val) {
        return false;
      }
      head = head.next;
      slow = slow.next;
    }
    return true;
  }

  private ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }
}
