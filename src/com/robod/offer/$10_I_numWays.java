package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/20 8:49
 * 剑指 Offer 10- II. 青蛙跳台阶问题
 */
public class $10_I_numWays {

    public int numWays(int n) {
        if(n<3) return n==0?1:n;
        int result = 0;    //跳法
        int a = 1;
        int b = 2;
        for(int i = 3;i<=n;i++) {
            result = (a + b)%1000000007;
            a = b;
            b = result;
        }
        return result;
    }

}
