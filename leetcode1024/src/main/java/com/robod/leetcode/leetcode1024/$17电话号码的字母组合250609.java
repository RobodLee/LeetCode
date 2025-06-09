package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.cn/problems/letter-combinations-of-a-phone-number
 */
public class $17电话号码的字母组合250609 {

    private final Map<Character, String> phoneMap = new HashMap<Character, String>() {
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        List<String> resultList = new ArrayList<>();
        List<Character> tempList = new ArrayList<>();

        recursion(0, resultList, tempList, digits.toCharArray());
        return resultList;
    }

    private void recursion(int index, List<String> resultList, List<Character> tempList, char[] chars) {
        if (tempList.size() == chars.length) {
            resultList.add(buildString(tempList));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            String numStr = phoneMap.get(chars[i]);
            for (int j = 0; j < numStr.length(); j++) {
                char c = numStr.charAt(j);
                tempList.add(c);
                recursion(i + 1, resultList, tempList, chars);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    private String buildString(List<Character> tempList) {
        StringBuilder b = new StringBuilder();
        for (Character c : tempList) {
            b.append(c);
        }
        return b.toString();
    }

    public static void main(String[] args) {
        System.out.println(new $17电话号码的字母组合250609().letterCombinations("22"));
    }

}
