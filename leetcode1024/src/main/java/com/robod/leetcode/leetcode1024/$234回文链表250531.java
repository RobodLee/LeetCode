package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * https://leetcode.cn/problems/palindrome-linked-list
 */
public class $234回文链表250531 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!Objects.equals(list.get(left), list.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

}
