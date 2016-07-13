package addTwoNumbers_2;

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode s = new ListNode(0);
    int l1Num = 0;
    int l2Num = 0;
    int carrier = 0;
    while (l1 != null || l2 != null) {
      if (l1 != null) {
        l1Num = l1.val;
      }
      if (l2 != null) {
        l2Num = l2.val;
      }
      int sum = l1Num + l2Num + carrier;
      carrier = sum / 10;
      sum = sum % 10;
      s.val = sum;
      s = s.next;
      l1 = l1.next;
      l2 = l2.next;
    }
    return s;
  }
  
  public static void main(String [] args) {
    ListNode l1 = new ListNode(2);
    
    System.out.println(l1.val);
  }
}
