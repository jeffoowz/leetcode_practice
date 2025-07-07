package s2_add_two_number;

import common.ListNode;

public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode p = dummy;
    int carry = 0;

    while (l1 != null || l2 != null) {
      int a = 0;
      int b = 0;

      if (l1 != null) {
        a = l1.val;
      }

      if (l2 != null) {
        b = l2.val;
      }

      int sum = a + b + carry;
      ListNode n = new ListNode(sum % 10);
      p.next = n;
      p = p.next;
      carry = sum / 10;

      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }

    if (carry != 0) {
      p.next = new ListNode(1);
    }

    return dummy.next;
  }

  public static void main(String[] args) {
    Solution ts = new Solution();
    ListNode testCase1 = ts.addTwoNumbers(
        ListNode.createListNode(new int[]{2, 4, 3}),
        ListNode.createListNode(new int[]{5, 6, 4})
    );
    System.out.println(ListNode.printList(ListNode.createListNode(new int[]{2, 4, 3})));
    System.out.println(ListNode.printList(testCase1));


  }
}