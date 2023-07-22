package com.robod.leetcode.leetcode1024;

import java.util.*;

/**
 * @ClassName $49字母异位词分组220501
 * @Description 中等。哈希。https://leetcode-cn.com/problems/group-anagrams/
 * @Author Robod
 * @Date 2022/5/1 20:02
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $49字母异位词分组220501 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

}
