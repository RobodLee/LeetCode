package com.robod.leetcode.leetcode1024;

/**
 * @author Robod
 * @date 2022/3/3 11:47
 * @description 给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。
 * 注意：如果对空文本输入退格字符，文本继续为空。
 */
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
