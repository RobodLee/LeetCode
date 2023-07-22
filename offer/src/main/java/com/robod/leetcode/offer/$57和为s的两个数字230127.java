package com.robod.leetcode.offer;

/**
 * @ClassName $57和为s的两个数字230127
 * @Description 简单。https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 * @Author Robod
 * @Date 2023/1/27 18:02
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $57和为s的两个数字230127 {

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (true) {
            if (nums[left] + nums[right] < target) {
                left++;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                break;
            }
        }

        int[] result = new int[2];
        result[0] = nums[left];
        result[1] = nums[right];

        return result;
    }

}
