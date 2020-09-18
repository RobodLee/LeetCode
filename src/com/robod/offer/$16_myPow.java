package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/3 8:39
 * 数值的整数次方
 */
public class $16_myPow {

    //2020-9-3
    public double myPow(double x, int n) {
        double result = 1.0;
        for(int i = 0;i<n;i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new $16_myPow().myPow(2.00000, 10));
    }

}
