package com.robod.leetcode.leetcode1024;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/subarray-sum-equals-k
 */
public class $560和为K的子数组250529 {

    public int subarraySum(int[] nums, int k) {
        int[] preNums = new int[nums.length + 1];
        preNums[0] = 0;

        // 计算前缀和
        for (int i = 0; i < nums.length; i++) {
            preNums[i + 1] = preNums[i] + nums[i];
        }

        // 求两数之和
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int preNum : preNums) {
            // 前缀和数组中，若存在preNum-k，说明这个区间的和是k
            if (map.containsKey(preNum - k)) {
                result += map.get(preNum - k);
            }

            int count = map.getOrDefault(preNum, 0);
            map.put(preNum, count + 1);
        }
        return result;
    }

}
