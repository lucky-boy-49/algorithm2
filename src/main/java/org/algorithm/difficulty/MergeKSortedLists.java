package org.algorithm.difficulty;

import org.algorithm.ListNode;

/**
 * 23.合并K个升序链表
 * @author jiahe
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return dfs(lists, 0, lists.length - 1);
    }

    private ListNode dfs(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        int mid = l + (r - l) / 2;
        ListNode l1 = dfs(lists, l, mid);
        ListNode l2 = dfs(lists, mid + 1, r);
        if (l1 != null && l2 != null) {
            return mergeLists(l1, l2);
        }
        if (l1 != null) {
            return l1;
        }
        return l2;
    }

    private ListNode mergeLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode cut = root;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cut.next = l1;
                l1 = l1.next;
            } else {
                cut.next = l2;
                l2 = l2.next;
            }
            cut = cut.next;
        }

        if (l1 != null) {
            cut.next = l1;
        }

        if (l2 != null) {
            cut.next = l2;
        }

        return root.next;
    }

}
