package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName $763划分字母区间230222
 * @Description 中等，贪心。https://leetcode.cn/problems/partition-labels/
 * @Author Robod
 * @Date 2023/2/22 01:10
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $763划分字母区间230222 {

    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        int sectionEndIndex = 0;   // 当前区间的末尾
        int preEndIndex = -1;   // 上一区间的末尾
        for (int i = 0; i < s.length(); i++) {
            sectionEndIndex = Math.max(map.get(s.charAt(i)), sectionEndIndex);
            if (sectionEndIndex == i) {
                result.add(i - preEndIndex);
                preEndIndex = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new $763划分字母区间230222().partitionLabels("ababcbacadefegdehijhklij");
    }

}
