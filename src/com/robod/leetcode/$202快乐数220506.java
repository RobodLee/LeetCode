package com.robod.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Robod
 * @date 2022/5/6 22:47
 * @description :https://leetcode-cn.com/problems/happy-number/
 *
 * 简单。Set
 */
public class $202快乐数220506 {

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n != 0) {    //求各位平方和
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (!set.add(sum)) {
                return false;   //如果sum的值在set中出现过，说明已经进入到死循环，结束，返回false
            } else {
                if (sum == 1) {
                    return true;    //各位平方和为1返回true
                }
            }
            n = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
