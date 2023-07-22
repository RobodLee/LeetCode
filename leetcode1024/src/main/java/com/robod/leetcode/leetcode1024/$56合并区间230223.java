package com.robod.leetcode.leetcode1024;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @ClassName $56合并区间230223
 * @Description 中等，贪心。https://leetcode.cn/problems/merge-intervals/
 * @Author Robod
 * @Date 2023/2/23 17:12
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $56合并区间230223 {

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        LinkedList<int[]> result = new LinkedList<>();
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.getLast();
            if (intervals[i][0] <= last[1]) {
                last[1] = Math.max(last[1], intervals[i][1]);
                result.set(result.size() - 1, last);
            } else {
                result.add(intervals[i]);
            }
        }

        return result.toArray(new int[result.size()][2]);
    }

}
