package com.robod.offer;

import com.robod.entity.ListNode;

import java.util.Stack;

/**
 * @author Robod
 * @date 2020/9/18 9:53
 * 剑指 Offer 06. 从尾到头打印链表
 */
public class $6_reversePrint {

    //2020-9-18
    public int[] reversePrint(ListNode head) {
        if (head == null) return new int[0];
        Stack<Integer> stack = new Stack<>();
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int i = stack.size();
        int[] result = new int[i];
        while(!stack.empty()) {
            result[i++] = stack.pop();
        }
        return result;
    }

}
