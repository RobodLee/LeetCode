package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $33搜索旋转排序数组241206
 * @Description 中等。https://leetcode.cn/problems/search-in-rotated-sorted-array/description/
 * @Author Robod
 * @Date 2024/12/6 07:39
 */
public class $33搜索旋转排序数组241206 {

    /**
     * 思路: 数组旋转。二分后肯定有一边是有序的，在有序的一边再二分搜索。如果不在有序的一边，将无序的一边继续二分找有序的一边，以此类推。
     */
    public int search(int[] nums, int target) {
        return dig(nums, target, 0, nums.length - 1);
    }

    private int dig(int[] nums, int target, int l, int r) {
        if (l >= r && nums[l] != target) {
            return -1;
        }
        if (l == r && nums[l] == target) {
            return l;
        }

        int mid = (l + r) / 2;

        // 1. lr整体有序
        if (nums[l] <= nums[mid] && nums[mid] <= nums[r]) {
            if (nums[l] < target && nums[r] < target) {
                // 不在范围内
                return -1;
            }

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                return dig(nums, target, l, mid - 1);
            }

            return dig(nums, target, mid + 1, r);
        }

        // 2.lr一边有序
        if (nums[l] <= nums[mid]) {
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[l] <= target && target <= nums[mid]) {
                // 左边有序，并且在左边
                return dig(nums, target, l, mid);
            } else {
                // 左边有序，但是在右边
                return dig(nums, target, mid + 1, r);
            }
        } else {
            if (nums[mid] <= target && target <= nums[r]) {
                // 右边有序，并且在右边
                return dig(nums, target, mid, r);
            } else {
                // 右边有序，但是在左边
                return dig(nums, target, l, mid);
            }
        }

    }

    public static void main(String[] args) {
        int search = new $33搜索旋转排序数组241206().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        System.out.println(search);
    }

}
