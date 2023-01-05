package com.robod.leetcode;

/**
 * @author Robod
 * @date 2022/2/28 10:54
 * @description 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * 二分查找
 */
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
