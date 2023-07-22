package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $34在排序数组中查找元素的第一个和最后一个位置220228
 * @Description 中等，二分。https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @Author Robod
 * @Date 2022/2/28 16:53
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $34在排序数组中查找元素的第一个和最后一个位置220228 {

    private int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                int start = middle;
                int end = middle;
                while (true) {
                    if (start - 1 >= 0 && nums[start - 1] == target) {
                        start--;
                    } else {
                        break;
                    }
                }
                while (true) {
                    if (end + 1 < nums.length && nums[end + 1] == target) {
                        end++;
                    } else {
                        break;
                    }
                }
                return new int[]{start, end};
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {};
        int target = 3;
        int[] result = new $34在排序数组中查找元素的第一个和最后一个位置220228().searchRange(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
