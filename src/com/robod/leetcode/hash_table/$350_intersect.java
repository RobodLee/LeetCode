package com.robod.leetcode.hash_table;

import java.util.*;

/**
 * @author Robod
 * @date 2020/8/15 7:18
 * 两个数组的交集 II
 */
public class $350_intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i : nums1) map1.put(i , map1.getOrDefault(i,0)+1);
        for(int i : nums2) {
            if (map1.getOrDefault(i,0) > 0) {
                list.add(i);
                map1.put(i,map1.get(i)-1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
