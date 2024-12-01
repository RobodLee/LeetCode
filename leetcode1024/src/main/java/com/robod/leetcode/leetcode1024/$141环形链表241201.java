package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName $141环形链表241201
 * @Description 简单。https://leetcode.cn/problems/linked-list-cycle/description/
 * @Author Robod
 * @Date 2024/12/1 19:34
 */
public class $141环形链表241201 {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

}
