package common;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode createListNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i =1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static String printList(ListNode head) {
        ListNode current = head;
        StringBuilder s = new StringBuilder();
        if (current == null ) {
            return s.toString();
        }
        while (current != null) {
            s.append(current.val).append(" -> ");
            current = current.next;
        }

        s.append("null");
        return s.toString();
    }
}