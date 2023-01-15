package com.robod.leetcode.offer;

/**
 * @ClassName $21调整数组顺序使奇数位于偶数前面
 * @Description 简单：https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 * @Author Robod
 * @Date 2023/1/14 23:34
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $21调整数组顺序使奇数位于偶数前面230114 {

    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // 左指针指向奇数就向右移动一位
            if (nums[left] % 2 == 1) {
                left++;
            }
            // 右指针指向偶数就向左移动一位
            if (nums[right] % 2 == 0) {
                right--;
            }
            // 当左指针指向偶数 右指针指向奇数 时就交换
            if (left < right && nums[left] % 2 == 0 && nums[right] % 2 == 1) {
                swap(left, right, nums);
                left++;
                right--;
            }
        }

        return nums;
    }

    private void swap(int l, int r, int[] nums) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

}
