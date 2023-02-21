package com.robod.leetcode.leetcode1024;

import java.util.Arrays;

/**
 * @ClassName $435无重叠区间230221
 * @Description 贪心，中等。https://leetcode.cn/problems/non-overlapping-intervals/
 * @Author Robod
 * @Date 2023/2/21 01:44
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $435无重叠区间230221 {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return Integer.compare(o1[0], o2[0]);
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int result = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] > intervals[i][0]) {
                result++;
                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
            }
        }

        return result;
    }

}
