package com.robod.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Robod
 * @date 2022/5/22 12:46
 * @description :https://leetcode.cn/problems/4sum-ii/
 * <p>
 * 中等。哈希
 */
public class $454四数相加II220522 {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;    //A[i] + B[j] + C[k] + D[l] = 0 的元组个数
        // key存放a+b的和，value存放a+b出现的次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        for (int c : nums3) {
            for (int d : nums4) {
                //如果将 0-(c+d) 的值作为key可以在map中找到，说明a+b+c+d等于0
                if (map.get(0 - (c + d)) != null) {
                    count += map.get(0 - (c + d));
                }
            }
        }
        return count;
    }

}
