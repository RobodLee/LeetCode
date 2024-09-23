package com.robod.leetcode.leetcode1024;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName $3无重复字符的最长子串240923
 * @Description 中等。https://leetcode.cn/problems/longest-substring-without-repeating-characters/description/
 * @Author Robod
 * @Date 2024/9/23 下午9:12
 */
public class $3无重复字符的最长子串240923 {

    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            right = i;
            maxLength = Math.max(maxLength, right - left + 1);
            set.add(s.charAt(right));
        }

        return maxLength;
    }

}
