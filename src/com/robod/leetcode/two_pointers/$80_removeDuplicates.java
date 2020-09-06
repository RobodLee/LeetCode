package com.robod.leetcode.two_pointers;

/**
 * @author Robod
 * @date 2020/9/6 21:12
 * 删除排序数组中的重复项 II
 */
public class $80_removeDuplicates {

    //2020-9-6
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length==0) return 0;
        int num = nums[0];
        int numCount = 0;
        for(int i=0 ; i<length ; i++) {
            if(nums[i] == num) {
                numCount++;
            } else {
                num = nums[i];
                numCount = 1;
            }
            if(numCount > 2) {
                for(int j = i;j<length-1;j++) {
                    nums[j] = nums[j+1];
                }
                i--;
                length--;
            }
        }
        return length;
    }

}
