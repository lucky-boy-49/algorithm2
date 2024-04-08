package org.algorithm.medium;

import org.algorithm.ListNode;
import org.junit.jupiter.api.Test;

class SortListTest {

    @Test
    void sortList() {
        ListNode node4 = new ListNode(0);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(5, node2);
        ListNode root = new ListNode(-1, node1);
        SortList sortList = new SortList();
        sortList.sortList(root);
    }
}