package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/3 8:39
 * 数值的整数次方
 */
public class $16_myPow {

    //2020-9-25
    public double myPow(double x, int n) {
        if(n==0) return 1;  //任何数的0次方等于0，0的0次方也当成0处理
        if(Double.doubleToLongBits(x) == Double.doubleToLongBits(1.0)) {
            return 1.0; //1的任意次方等于1
        }

        if(Double.doubleToLongBits(x) == Double.doubleToLongBits(-1.0)) {
            if((n & 0x1) == 1) return -1;
            return 1;   //-1的奇数次方等于-1，偶数次方等于1
        }

        if(n<=Integer.MIN_VALUE) return 0.0;

        int nAbs = n;   //n的绝对值
        if(n<0) nAbs = -n;

        double result = core(x,nAbs);

        return n<0 ? 1.0/result : result;
    }

    public double core(double x,int n) {
        if(n == 0) return 1;
        if(n == 1) return x;

        double result = core(x,n>>1);
        result *= result;
        if((n & 0x1) == 1)    //判断a是不是奇数
            result *= x;

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
    }

}
