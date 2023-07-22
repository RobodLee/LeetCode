package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $283移动零220301
 * @Description 简单。https://leetcode.cn/problems/move-zeroes/
 * @Author Robod
 * @Date 2022/3/1 11:45
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $283移动零220301 {

    private void moveZeroes(int[] nums) {
        int slowPointer = 0;
        for (int fastPointer = 0; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != 0) {
                int temp = nums[slowPointer];
                nums[slowPointer++] = nums[fastPointer];
                nums[fastPointer] = temp;
            }
        }
    }

    public static void main(String[] args) {

    }
}
