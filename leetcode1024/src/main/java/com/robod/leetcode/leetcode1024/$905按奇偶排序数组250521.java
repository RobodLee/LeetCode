package com.robod.leetcode.leetcode1024;

/**
 * https://leetcode.cn/problems/sort-array-by-parity
 */
public class $905按奇偶排序数组250521 {

    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        //        int right = arr.length - 1;

        while (index < nums.length) {
            if (nums[index] % 2 == 1) {
                index++;
                continue;
            }

            int k = index - 1;
            int j = index;
            while (k >= 0) {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                k--;
                j--;
            }

            index++;
        }
        return nums;
    }

}
