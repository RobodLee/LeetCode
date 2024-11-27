package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $38外观数列
 * @Description 中等。https://leetcode.cn/problems/count-and-say/description/
 * @Author Robod
 * @Date 2024/11/27 下午9:02
 */
public class $38外观数列241127 {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);
        return rle(str);
    }

    /**
     * 计算字符串的行程长度编码
     */
    private String rle(String str) {
        StringBuilder result = new StringBuilder();

        char c = str.charAt(0);
        int cCount = 1;
        for (int i = 1; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                cCount++;
            } else {
                result.append(cCount).append(c);
                c = str.charAt(i);
                cCount = 1;
            }
        }
        result.append(cCount).append(c);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new $38外观数列241127().countAndSay(3));
    }

}
