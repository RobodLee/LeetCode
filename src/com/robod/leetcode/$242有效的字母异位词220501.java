package com.robod.leetcode;

/**
 * @author Robod
 * @date 2022/5/1 19:51
 * @description 链接；https://leetcode-cn.com/problems/valid-anagram/
 *
 * 简单。哈希
 */
public class $242有效的字母异位词220501 {

    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (record[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
