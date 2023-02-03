package com.robod.leetcode.offer;

import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $35复杂链表的复制230202
 * @Description 中等。https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 * @Author Robod
 * @Date 2023/2/2 14:38
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $35复杂链表的复制230202 {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // <旧节点,新节点>
        Map<Node, Node> dic = new HashMap<>();

        // 第一遍遍历，复制节点
        Node cur = head;
        while (cur != null) {
            Node newCur = new Node(cur.val);
            dic.put(cur, newCur);

            cur = cur.next;
        }

        // 第二遍遍历，复制节点指针
        cur = head;
        while (cur != null) {
            Node newCur = dic.get(cur);
            newCur.next = dic.get(cur.next);
            newCur.random = dic.get(cur.random);

            cur = cur.next;
        }

        return dic.get(head);
    }

    @EqualsAndHashCode
    private static class Node {

        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }

    }
}
