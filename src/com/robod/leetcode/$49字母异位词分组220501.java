package com.robod.leetcode;

import java.util.*;

/**
 * @author Robod
 * @date 2022/5/1 20:02
 * @description 链接：https://leetcode-cn.com/problems/group-anagrams/
 * <p>
 * 中等。哈希
 */
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
