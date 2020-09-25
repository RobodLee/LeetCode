package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/24 19:23
 * 剑指 Offer 15. 二进制中1的个数
 */
public class $15_hammingWeight {

    //2020-9-24
    public int hammingWeight(int n) {
        int flag = 1;
        int count = 0;
        while(flag > 0) {
            if((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        if ((n & (1<<31)) != 0) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new $15_hammingWeight().hammingWeight(0b101));
    }

}
