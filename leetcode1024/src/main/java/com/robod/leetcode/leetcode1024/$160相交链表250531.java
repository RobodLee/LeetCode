package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.cn/problems/intersection-of-two-linked-lists
 */
public class $160相交链表250531 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> aSet = new HashSet<>();
        while (headA != null) {
            aSet.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (aSet.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;

    }

}
