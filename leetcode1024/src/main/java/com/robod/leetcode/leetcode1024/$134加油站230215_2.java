package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $134加油站230215_2
 * @Description 中等。https://leetcode.cn/problems/gas-station/
 * @Author Robod
 * @Date 2023/2/15 20:51
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $134加油站230215_2 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;//当前剩余油量
        int totalSum = 0;//总剩余油量
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];

            // 当前油量小于0说明从start开始行不通，以i+1作为新起点
            if (curSum < 0) {
                start = i + 1;
                curSum = 0;
            }
        }

        // 当总剩余油量小于0时，说明从哪一站开始都不行
        if (totalSum >= 0) {
            return start;
        }
        return -1;
    }

}
