package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $209长度最小的子数组220306
 * @Description 中等。滑动窗口。https://leetcode.cn/problems/minimum-size-subarray-sum/
 * @Author Robod
 * @Date 2022/3/6
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $209长度最小的子数组220306 {

    private int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;    //滑动窗口中数字总和
        for (int left = 0, right = 0; right < nums.length; right++) {
            sum += nums[right];
            //当窗口总和大于等于target时，调整窗口左边界，以找到符合条件的最小窗口
            while (sum >= target) {
                result = Integer.min(result, right - left + 1); //比较原窗口大小与现窗口大小，取较小值
                sum -= nums[left++];    //调整窗口左边界
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

}
