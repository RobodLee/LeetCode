package com.robod.leetcode;

/**
 * @author Robod
 * @date 2022/5/1 19:57
 * @description
 *
 * 链接：https://leetcode-cn.com/problems/ransom-note/
 *
 * 简单。哈希
 */
public class $383赎金信220501 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        for (char c : ransomNote.toCharArray()) {
            record[c - 'a']++;
        }
        for (char c : magazine.toCharArray()) {
            record[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (record[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
