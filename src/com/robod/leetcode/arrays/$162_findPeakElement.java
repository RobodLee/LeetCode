package com.robod.leetcode.arrays;

/**
 * @author Robod
 * @date 2020/8/13 8:29
 * 寻找峰值
 */
public class $162_findPeakElement {
    public int findPeakElement(int[] nums) {
        return search(0,nums.length-1,nums);
    }

    public int search(int left,int right,int[] nums) {
        int middle = left + (right-left)/2;
        if (nums[middle] >= nums[Math.max(middle - 1, 0)]
                && nums[middle] >= nums[Math.min(middle + 1, nums.length - 1)]) {
            return middle;
        } else if(nums[middle] >= nums[Math.max(middle - 1, 0)]
                && nums[middle] <= nums[Math.min(middle + 1, nums.length - 1)]) {
            return search(middle+1,right,nums);
        }
        return search(left,middle-1,nums);
    }

    public static void main(String[] args) {
        System.out.println(new $162_findPeakElement().findPeakElement(new int[]{1,2,1,2,1}));
    }
}
