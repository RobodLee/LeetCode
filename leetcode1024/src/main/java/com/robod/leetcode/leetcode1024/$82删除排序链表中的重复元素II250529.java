package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii
 */
public class $82删除排序链表中的重复元素II250529 {

    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();

        ListNode node = head;
        while (node != null) {
            int count = map.computeIfAbsent(node.val, k -> 0);
            map.put(node.val, count + 1);
            node = node.next;
        }

        ListNode vNode = new ListNode();
        vNode.next = head;
        node = vNode;
        while (node.next != null) {
            if (map.get(node.next.val) > 1) {
                // System.out.println(node.next.val+"    "+map.get(node.next.val));
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return vNode.next;
    }

}
