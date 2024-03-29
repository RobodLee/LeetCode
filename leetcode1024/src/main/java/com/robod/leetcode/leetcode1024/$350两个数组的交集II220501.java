package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName $350两个数组的交集II220501
 * @Description 简单。https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * @Author Robod
 * @Date 2022/5/1 20:36
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $350两个数组的交集II220501 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        //将nums1放入map中，key为nums1中出现过的数，value为出现的次数
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> resList = new ArrayList<>();
        //将nums2中在nums1中出现过的数放入到list中
        for (int j : nums2) {
            if (map.getOrDefault(j, 0) > 0) {
                resList.add(j);
                map.put(j, map.get(j) - 1);
            }
        }
        //将list转换为数组返回
        int[] res = new int[resList.size()];
        int index = 0;
        for (Integer k : resList) {
            res[index++] = k;
        }
        return res;
    }

}
