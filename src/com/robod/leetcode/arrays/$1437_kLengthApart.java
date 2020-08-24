package com.robod.leetcode.arrays;

/**
 * @author Robod
 * @date 2020/8/24 8:51
 * 是否所有 1 都至少相隔 k 个元素
 */
public class $1437_kLengthApart {
    //2020-8-24
    public boolean kLengthApart(int[] nums, int k) {
        int p=0;
        int i=0;
        while(i<nums.length && nums[i++]!=1);
        p = i-1;
        for(; i<nums.length;i++) {
            if(nums[i] == 1) {
                if(k > i-p-1) return false;
                p = i;
            }
        }
        return true;
    }

}
