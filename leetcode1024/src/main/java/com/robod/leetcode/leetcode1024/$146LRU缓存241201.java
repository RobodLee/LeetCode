package com.robod.leetcode.leetcode1024;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $146LRU缓存241201
 * @Description 中等。哈希表，双向链表。https://leetcode.cn/problems/lru-cache/description/
 * @Author Robod
 * @Date 2024/12/1 00:11
 */
public class $146LRU缓存241201 {

    class LRUCache {

        class LruNode {
            private Integer key;
            private Integer value;

            private LruNode pre;
            private LruNode next;

            public LruNode(Integer key, Integer value) {
                this.key = key;
                this.value = value;
            }
        }

        // Map<key,value>
        private final Map<Integer, LruNode> lruMap;
        private final LruNode head;
        private final LruNode tail;
        private final Integer capacity;

        public LRUCache(int capacity) {
            lruMap = new HashMap<>(capacity);
            this.capacity = capacity;

            // 虚拟头尾节点
            head = new LruNode(null, null);
            tail = new LruNode(null, null);
            head.pre = tail;
            tail.next = head;
        }

        public int get(int key) {
            LruNode valueNode = lruMap.get(key);
            if (valueNode != null) {
                // 先从链表中删除再添加到头
                remove(valueNode);
                addToHead(valueNode);
                return valueNode.value;
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            LruNode valueNode = lruMap.get(key);
            if (valueNode != null) {
                valueNode.value = value;
                // 先从链表中删除再添加到头
                remove(valueNode);
                addToHead(valueNode);
            } else {
                valueNode = new LruNode(key, value);
                lruMap.put(key, valueNode);
                // 新增的，直接移动到头
                addToHead(valueNode);
            }

            if (lruMap.size() > capacity) {
                // 超了，直接把最后一个删除
                Integer tailKey = removeTail();
                lruMap.remove(tailKey);
            }

        }

        /**
         * 移除节点
         */
        private void remove(LruNode node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        /**
         * 节点添加到头
         */
        private void addToHead(LruNode node) {
            node.pre = head.pre;
            node.next = head;

            head.pre.next = node;
            head.pre = node;
        }

        /**
         * 移除末尾节点
         */
        private Integer removeTail() {
            Integer tailKey = tail.next.key;
            tail.next.next.pre = tail;
            tail.next = tail.next.next;
            return tailKey;
        }
    }
}
