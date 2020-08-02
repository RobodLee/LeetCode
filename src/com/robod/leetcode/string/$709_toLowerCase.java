package com.robod.leetcode.string;

/**
 * @author Robod
 * @date 2020/8/1 17:01
 * 转换成小写字母
 */
public class $709_toLowerCase {

    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        int diff = 'a'-'A';
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='A' && chars[i]<='Z') {
                chars[i] += diff;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(new $709_toLowerCase().toLowerCase("Hello"));
    }

}
