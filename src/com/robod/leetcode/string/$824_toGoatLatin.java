package com.robod.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Robod
 * @date 2020/8/1 20:17
 * 山羊拉丁文
 */
public class $824_toGoatLatin {

    public String toGoatLatin(String S) {
        Map<String,String> map = new HashMap<>(16);
        map.put("a","a");
        map.put("e","e");
        map.put("i","i");
        map.put("o","o");
        map.put("u","u");
        map.put("A","A");
        map.put("E","E");
        map.put("I","I");
        map.put("O","O");
        map.put("U","U");
        String ma = "maa";
        String[] strings = S.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            if (map.containsKey(s.substring(0,1))){
                builder.append(s).append(ma).append(" ");
            } else {
                s = s.substring(1)+s.substring(0,1)+ma+" ";
                builder.append(s);
            }
            ma += "a";
        }
        return builder.substring(0,builder.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(new $824_toGoatLatin().toGoatLatin("I speak Goat Latin"));
        System.out.println(new $824_toGoatLatin().toGoatLatin("Each word consists of lowercase and uppercase letters only"));
    }
}
