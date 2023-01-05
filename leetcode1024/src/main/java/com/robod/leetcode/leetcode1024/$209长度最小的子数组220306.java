package com.robod.leetcode.leetcode1024;

/**
 * @author Robod
 * @date 2022/3/6
 * @description 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * <p>
 * 中等。滑动窗口
 */
public class $209长度最小的子数组220306 {

    private int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;    //滑动窗口中数字总和
        for (int left = 0, right = 0; right < nums.length; right++) {
            sum += nums[right];
            //当窗口总和大于等于target时，调整窗口左边界，以找到符合条件的最小窗口
            while (sum >= target) {
                result = Integer.min(result, right - left + 1); //比较原窗口大小与现窗口大小，取较小值
                sum -= nums[left++];    //调整窗口左边界
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

}
