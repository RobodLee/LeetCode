package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $1005K次取反后最大化的数组和230215
 * @Description 简单，贪心。https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations/
 * @Author Robod
 * @Date 2023/2/15 14:04
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $1005K次取反后最大化的数组和230215 {

    public int largestSumAfterKNegations(int[] nums, int k) {
        sortAbs(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                k--;
                nums[i] = -nums[i];
            }
            sum += nums[i];
        }

        if (k % 2 == 1) {
            sum -= nums[nums.length - 1];
            nums[nums.length - 1] = -nums[nums.length - 1];
            sum += nums[nums.length - 1];
        }

        return sum;
    }

    // 冒泡排序，按绝对值从大到小排列
    private void sortAbs(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for (int j = nums.length - 1; j > i; j--) {
                if (Math.abs(nums[j - 1]) < Math.abs(nums[j])) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

}
