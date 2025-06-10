package com.robod.leetcode.leetcode1024;

/**
 * https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class $34在排序数组中查找元素的第一个和最后一个位置250610 {

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                int start = mid;
                while (start - 1 >= 0 && nums[start - 1] == target) {
                    start--;
                }
                int end = mid;
                while (end + 1 < nums.length && nums[end + 1] == target) {
                    end++;
                }
                return new int[]{start, end};
            }

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
