package com.robod.leetcode.binary_search;

/**
 * @author Robod
 * @date 2020/8/6 9:13
 * 二分查找
 */
public class $704_search {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int middle;
        while(left<=right){
            middle = left + (right-left)/2;
            if(nums[middle]==target) return middle;
            if (nums[middle] > target) right = middle-1;
            else left = middle+1;
        }
        return -1;
    }
}
