package s21_merge_two_sorted_lists;

import common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            if (list1 == null) {
                return list2;
            }

            return list1;
        }

        if (list1.val > list2.val) {
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }

        list1.next = mergeTwoLists(list1.next, list2);

        return list1;
    }

    public static void main(String[] args) {
        Solution ts = new Solution();

    }
}