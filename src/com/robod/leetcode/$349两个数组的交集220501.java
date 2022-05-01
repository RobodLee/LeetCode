package com.robod.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Robod
 * @date 2022/5/1 20:31
 * @description :https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * <p>
 * 简单。Set
 */
public class $349两个数组的交集220501 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        //将nums1中的数添加到set中
        for (int i : nums1) {
            set.add(i);
        }
        //将nums2中在set中已有的数(交集)添加到resSet中
        for (int j : nums2) {
            if (set.contains(j)) {
                resSet.add(j);
            }
        }
        //将resSet转换为数组返回
        int[] res = new int[resSet.size()];
        int index = 0;
        for (int k : resSet) {
            res[index++] = k;
        }
        return res;
    }
}
