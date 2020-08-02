package com.robod.leetcode.string;

/**
 * @author Robod
 * @date 2020/8/2 8:58
 * 最后一个单词的长度
 */
public class $58_lengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int len = 0;
        int index = s.length()-1;
        while (index>=0 && s.charAt(index)==' ') {
            index--;
        }
        while (index>=0 && s.charAt(index--)!=' '){
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(new $58_lengthOfLastWord().lengthOfLastWord("a "));
    }
}
