package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Robod
 * @date 2022/5/1 20:03
 * @description :https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 * <p>
 * 中等。哈希
 */
public class $438找到字符串中所有字母异位词220501 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int pLength = p.length();
        char[] pChars = p.toCharArray();
        Arrays.sort(pChars);
        String sortP = new String(pChars);  //排序后的字符串p
        //遍历s，从中获取子串，并将子串进行排序，如果排序后的子串与sortP相等，则说明该子串是p的字母异位词，将该子串的起始位置添加到list中
        for (int i = 0; i <= s.length() - pLength; i++) {
            String sub = s.substring(i, i + pLength);
            char[] subChars = sub.toCharArray();
            Arrays.sort(subChars);
            String sortSub = new String(subChars);
            if (sortSub.equals(sortP)) {
                result.add(i);
            }
        }
        return result;
    }
}
