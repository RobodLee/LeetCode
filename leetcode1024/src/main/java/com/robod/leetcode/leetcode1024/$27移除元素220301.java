package com.robod.leetcode.leetcode1024;

/**
 * @author Robod
 * @date 2022/3/1 9:57
 * @description 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 简单
 */
public class $27移除元素220301 {

    /**
     * 双指针法，遍历时，判断快指针指向元素是否与目标元素不相等。相等则不进入if，不相等则将快指针元素赋值给慢指针元素。也就是说，慢指针指向的是最终的数组，快指针依次将原数组中符合条件的元素赋值给慢指针。
     * 如果不理解，可以先创建一个新的数组，慢指针指向新数组，就可以看做是将原数组中的符合条件的值依次赋值给新数组。
     * @param nums
     * @param val
     * @return
     */
    private int removeElement(int[] nums, int val) {
        int slowPointer = 0;
        for (int fastPointer = 0; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != val) {
                nums[slowPointer++] = nums[fastPointer];
            }
        }
        return slowPointer;
    }

    public static void main(String[] args) {

    }
}
