package com.robod.leetcode.math;

import com.robod.entity.ListNode;

/**
 * @author Robod
 * @date 2020/8/8 20:10
 */
public class $2_addTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode p = result;
        int temp = 0;
        while(l1!=null || l2!=null) {
            int a = (l1!=null ? l1.val : 0) + (l2!=null ? l2.val : 0) + temp;
            p = p.next = new ListNode(a%10);
            l1 = (l1!=null) ? l1.next : null;
            l2 = (l2!=null) ? l2.next : null;
            temp = a/10;
        }
        if(temp != 0) p.next = new ListNode(temp);
        return result.next;
    }

}
