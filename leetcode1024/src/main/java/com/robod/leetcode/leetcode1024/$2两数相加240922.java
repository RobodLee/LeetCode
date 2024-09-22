package com.robod.leetcode.leetcode1024;

import cn.hutool.json.JSONUtil;
import com.robod.leetcode.common.entity.ListNode;

public class $2两数相加240922 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 进位位
        int carryVal = 0;
        ListNode res = new ListNode();
        ListNode cursor = res;
        while (l1 != null || l2 != null) {
            int l1Val = 0;
            if (l1 != null) {
                l1Val = l1.val;
                l1 = l1.next;
            }
            int l2Val = 0;
            if (l2 != null) {
                l2Val = l2.val;
                l2 = l2.next;
            }

            // 按位相加，并加上进位位，得到当前位的和，并计算进位位
            ListNode node = new ListNode();
            int sum = l1Val + l2Val + carryVal;
            node.val = (sum % 10);
            carryVal = sum / 10;
            cursor.next = node;
            cursor = cursor.next;
        }

        if (carryVal != 0) {
            cursor.next = new ListNode(carryVal);
        }

        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9, new ListNode(9,
                                                                        new ListNode(9))))))))));

        ListNode listNode = new $2两数相加240922().addTwoNumbers(l1, l2);
        System.out.println(JSONUtil.toJsonStr(listNode));
    }

}
