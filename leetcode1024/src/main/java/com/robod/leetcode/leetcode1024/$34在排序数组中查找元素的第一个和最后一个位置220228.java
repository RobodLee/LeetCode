package com.robod.leetcode.leetcode1024;

/**
 * @author Robod
 * @date 2022/2/28 16:53
 * @description 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 二分查找
 */
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
