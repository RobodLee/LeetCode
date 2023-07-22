package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $35搜索插入位置220228
 * @Description 简单。二分搜索。https://leetcode.cn/problems/search-insert-position/
 * @Author Robod
 * @Date 2022/2/28 12:08
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $35搜索插入位置220228 {

    private int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int result = new $35搜索插入位置220228().searchInsert(nums, target);
        System.out.println(result);
    }
}
