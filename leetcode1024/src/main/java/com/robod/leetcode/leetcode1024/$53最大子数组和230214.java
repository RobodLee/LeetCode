package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $53最大子数组和230214
 * @Description 中等，贪心。https://leetcode.cn/problems/maximum-subarray/
 * @Author Robod
 * @Date 2023/2/14 22:50
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $53最大子数组和230214 {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = maxSum;

        for (int i = 1; i < nums.length; i++) {
            // 如果当前的累加为负数，还不如从nums[i]重新开始计算
            if (curSum < 0) {
                curSum = nums[i];
            } else {
                curSum += nums[i];
            }
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }

}
