package com.robod.leetcode.leetcode1024;

/**
 * @author Robod
 * @date 2022/3/1 11:45
 * @description 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * 简单，快慢双指针
 */
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
