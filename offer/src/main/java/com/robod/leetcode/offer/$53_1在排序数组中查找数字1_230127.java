package com.robod.leetcode.offer;

/**
 * @ClassName $53_1在排序数组中查找数字1_230127
 * @Description 简单:https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 * @Author Robod
 * @Date 2023/1/27 11:11
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $53_1在排序数组中查找数字1_230127 {

    /**
     * 先二分找到其中一个target，然后向左右两边搜索
     */
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;
        int middle = 0;

        while (left <= right) {
            middle = (left + right) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                break;
            }
        }

        if (nums[middle] != target) {
            return 0;
        }

        return count(nums, target, middle);
    }

    private int count(int[] nums, int target, int middle) {
        int res = 0;

        int left = middle;
        while (left >= 0 && nums[left--] == target) {
            res++;
        }

        int right = middle + 1;
        while (right < nums.length && nums[right++] == target) {
            res++;
        }

        return res;
    }

}
