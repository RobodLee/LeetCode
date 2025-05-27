package com.robod.leetcode.leetcode1024;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/longest-consecutive-sequence
 */
public class $128最长连续序列250527 {

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = nums.length == 0 ? 0 : 1;
        int nowLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == nums[i - 1]) {
                nowLen++;
                max = Math.max(max, nowLen);
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                nowLen = 1;
            }
        }
        return max;
    }

}
