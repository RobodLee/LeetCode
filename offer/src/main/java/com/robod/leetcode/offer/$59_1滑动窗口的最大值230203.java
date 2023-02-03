package com.robod.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @ClassName $59_1滑动窗口的最大值230203
 * @Description 困难。https://leetcode.cn/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
 * @Author Robod
 * @Date 2023/2/3 23:38
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $59_1滑动窗口的最大值230203 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int l = 0;
        int r = k - 1;
        Deque<Integer> deque = new LinkedList<>();

        // 未形成窗口
        for (int i = 0; i <= r; i++) {
            pushToDeque(deque, nums[i]);
        }
        res[l] = deque.peekFirst();

        // 已形成窗口
        for (l++, r++; r < nums.length; l++, r++) {
            // 新元素入队
            pushToDeque(deque, nums[r]);

            // 若移除窗口的元素在队首，则出队
            if (deque.peekFirst() == nums[l - 1]) {
                deque.pollFirst();
            }

            res[l] = deque.peekFirst();
        }

        return res;

    }

    private void pushToDeque(Deque<Integer> deque, int val) {
        // deque末尾小于val的元素都出队
        while (!deque.isEmpty() && deque.peekLast() < val) {
            deque.pollLast();
        }
        deque.add(val);
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        new $59_1滑动窗口的最大值230203().maxSlidingWindow(a, 3);
    }

}
