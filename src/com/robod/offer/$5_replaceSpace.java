package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/18 9:05
 * 剑指 Offer 05. 替换空格
 */
public class $5_replaceSpace {

    //2020-9-18
    public String replaceSpace(String s) {
        if(s==null || "".equals(s)) return s;
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) != ' ') {
                builder.append(s.charAt(i));
            } else {
                builder.append("%20");
            }
        }
        return builder.toString();
    }

}
