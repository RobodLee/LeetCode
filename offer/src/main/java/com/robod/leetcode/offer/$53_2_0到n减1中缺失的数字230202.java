package com.robod.leetcode.offer;

/**
 * @ClassName $53_2_0到n减1中缺失的数字230202
 * @Description 简单。https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/
 * @Author Robod
 * @Date 2023/2/2 19:37
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $53_2_0到n减1中缺失的数字230202 {

    /**
     * 二分搜索
     */
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == mid) {
                // nums[mid] == mid 缺失的数字肯定在右半部分
                left = mid + 1;
            } else {
                // nums[mid] == mid 缺失的数字在左半部分
                right = mid - 1;
            }
        }
        return left;
    }

}
