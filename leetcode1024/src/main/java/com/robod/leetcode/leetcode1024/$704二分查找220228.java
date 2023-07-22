package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $704二分查找220228
 * @Description 简单。https://leetcode.cn/problems/binary-search/
 * @Author Robod
 * @Date 2022/2/28 10:54
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $704二分查找220228 {

    private int search(int[] nums, int target) {
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
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5};
        int target = 5;
        int search = new $704二分查找220228().search(nums, target);
        System.out.println(search);
    }
}
