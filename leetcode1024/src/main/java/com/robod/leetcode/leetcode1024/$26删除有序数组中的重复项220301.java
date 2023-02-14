package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $26删除有序数组中的重复项220301
 * @Description 简单，快慢双指针.https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
 * @Author Robod
 * @Date 2022/3/1 10:47
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $26删除有序数组中的重复项220301 {

    private int removeDuplicates(int[] nums) {
        int slowPointer = 0;
        for (int fastPointer = 0; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != nums[slowPointer]) {
                nums[++slowPointer] = nums[fastPointer];
            }
        }
        return slowPointer + 1;
    }

}
