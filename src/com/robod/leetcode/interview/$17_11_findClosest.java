package com.robod.leetcode.interview;

/**
 * @author Robod
 * @date 2020/8/8 9:36
 */
public class $17_11_findClosest {

    public int findClosest(String[] words, String word1, String word2) {
        int[] word1Array = new int[words.length];
        int word1Num = 0;
        int[] word2Array = new int[words.length];
        int word2Num = 0;
        for(int i = 0;i<words.length;i++){
            if(words[i].equals(word1)) word1Array[word1Num++]=i;
            if(words[i].equals(word2)) word2Array[word2Num++]=i;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<word1Num;i++){
            for(int j = 0;j<word2Num;j++) {
                int temp = Math.abs(word1Array[i]-word2Array[j]);
                if (temp<min) min = temp;
            }
        }
        return min;
    }
    
}
