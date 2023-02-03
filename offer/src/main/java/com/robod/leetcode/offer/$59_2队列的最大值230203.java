package com.robod.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName $59_2队列的最大值230203
 * @Description 中等。https://leetcode.cn/problems/dui-lie-de-zui-da-zhi-lcof/
 * @Author Robod
 * @Date 2023/2/3 22:43
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $59_2队列的最大值230203 {

    static class MaxQueue {

        private final Queue<Integer> queue;
        private final Deque<Integer> deque; // 双向队列，用于存放队列最大值。

        public MaxQueue() {
            queue = new LinkedList<>();
            deque = new LinkedList<>();
        }

        public int max_value() {
            return deque.isEmpty() ? -1 : deque.peekFirst();
        }

        /**
         * 将deque末尾大于value的元素都出队
         */
        public void push_back(int value) {
            queue.add(value);
            while (!deque.isEmpty() && deque.peekLast() < value) {
                deque.pollLast();
            }
            deque.addLast(value);
        }

        public int pop_front() {
            if (!deque.isEmpty()
                    && !queue.isEmpty()
                    && deque.peekFirst().equals(queue.peek())) {
                deque.pollFirst();
            }
            return !queue.isEmpty() ? queue.poll() : -1;
        }
    }

}
