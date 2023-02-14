package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $376摆动序列230214
 * @Description 中等，贪心。https://leetcode.cn/problems/wiggle-subsequence/
 * @Author Robod
 * @Date 2023/2/14 20:01
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $376摆动序列230214 {

    public int wiggleMaxLength(int[] nums) {
        int preDiff = 0; //当前数与前一个数的差值，假设第一个数前面有一个与其相等的数，则差值为0
        int currDiff;   // 当前数与下一个数的差值
        int result = 1; // 默认最后一个数有一个摆动

        for (int i = 0; i < nums.length - 1; i++) {
            currDiff = nums[i + 1] - nums[i];
            if ((preDiff >= 0 && currDiff < 0) ||
                    (preDiff <= 0 && currDiff > 0)) {
                result++;
                preDiff = currDiff;
            }
        }

        return result;
    }

}
