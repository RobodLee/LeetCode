package com.robod.interview;

import com.robod.entity.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Robod
 * @date 2020/8/7 9:05
 * 移除重复节点
 */
public class $02_01_removeDuplicateNodes {

    public ListNode removeDuplicateNodes(ListNode head) {
        if(head==null) return head;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(head.val,0);
        ListNode node = head;
        while(node.next != null) {
            if(map.get(node.next.val) == null) {
                map.put(node.next.val,0);
                node = node.next;
            } else {
                node.next = node.next.next;
            }
        }
        return head;
    }

}
