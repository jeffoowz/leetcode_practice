package s206_reverse_linked_list;

import common.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head, prev = null, next;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Solution ts = new Solution();

    }
}