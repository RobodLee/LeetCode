package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $844比较含退格的字符串220303
 * @Description 简单。https://leetcode.cn/problems/backspace-string-compare/
 * @Author Robod
 * @Date 2022/3/3 11:47
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $844比较含退格的字符串220303 {

    private boolean backspaceCompare(String s, String t) {
        int sIndex = s.length() - 1;
        int tIndex = t.length() - 1;
        //s中该退格的字符
        int sSkip = 0, tSkip = 0;
        //只要有一个大于等于0则说明某一个串中存在未比较字符，循环继续
        while (sIndex >= 0 || tIndex >= 0) {
            //找到 s 中待比较的字符
            while (sIndex >= 0) {
                if (s.charAt(sIndex) == '#') {
                    sSkip++;
                    sIndex--;
                } else if (sSkip > 0) {
                    //sKip大于0说明存在该退格的字符，跳过字符
                    sSkip--;
                    sIndex--;
                } else {
                    break;
                }
            }
            //找到 t 中待比较的字符
            while (tIndex >= 0) {
                if (t.charAt(tIndex) == '#') {
                    tSkip++;
                    tIndex--;
                } else if (tSkip > 0) {
                    tSkip--;
                    tIndex--;
                } else {
                    break;
                }
            }
            //两个都大于0，说明存在待比较字符
            if (sIndex >= 0 && tIndex >= 0) {
                //待比较字符不一致，返回false
                if (s.charAt(sIndex) != t.charAt(tIndex)) {
                    return false;
                }
            } else if (sIndex >= 0 || tIndex >= 0) {
                //只有一个大于等于0，说明一个串已经比较结束，但另一个串中存在未比较的字符，说明两个串不相等
                return false;
            }
            sIndex--;
            tIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bbbextm", t = "bbb#extm";
        System.out.println(new $844比较含退格的字符串220303().backspaceCompare(s, t));
    }
}
