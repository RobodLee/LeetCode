package com.robod.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Robod
 * @date 2020/8/5 9:07
 * 拼写单词
 */
public class $1160_countCharacters {

    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<>();
        int length = 0;
        boolean flag;
        for (char c : chars.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> wordMap;
        for(String word:words){
            flag = true;
            wordMap = new HashMap<>();
            for(char c : word.toCharArray()){
                if(wordMap.getOrDefault(c,0)+1 > map.getOrDefault(c,0)){
                    flag = false;
                    break;
                }
                wordMap.put(c,wordMap.getOrDefault(c,0)+1);
            }
            if(flag){
                length += word.length();
            }
        }
        return length;
    }

}
