package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/20 8:37
 * 剑指 Offer 10- I. 斐波那契数列
 */
public class $10_I_fib {

    //2020-9-20
    public int fib(int n) {
        if(n<2) return n;
        int a = 0;     //fn-2
        int b = 1;     //fn-1
        int result = 1;
        for(int i = 2;i<=n;i++){
            result = (a+b)%1000000007;
            a = b;
            b = result;
        }
        return result;
    }

}
