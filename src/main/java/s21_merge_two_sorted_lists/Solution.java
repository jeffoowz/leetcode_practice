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

        while(list1 != null || list2 != null) {
            if (list1.val < list2.val) {

            }

            if (list1.next != null) {
                list1 = list1.next;
            }

            if (list2.next != null) {
                list2 = list2.next;
            }
        }

    }

    public static void main(String[] args) {
        Solution ts = new Solution();

    }
}