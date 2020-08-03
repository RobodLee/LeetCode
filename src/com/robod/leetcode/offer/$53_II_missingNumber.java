package com.robod.leetcode.offer;

/**
 * @author Robod
 * @date 2020/8/3 18:04
 * 0～n-1中缺失的数字
 */
public class $53_II_missingNumber {
    public int missingNumber(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int middle;
        while (left<=right){
            middle = (left+right)/2;
            if (nums[middle]==middle){
                left=middle+1;
            } else {
                right=middle-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(new $53_II_missingNumber().missingNumber(new int[]{0,1}));
    }
}
