package com.robod.leetcode.arrays;

/**
 * @author Robod
 * @date 2020/8/4 10:07
 * 大小为 K 且平均值大于等于阈值的子数组数目
 */
public class $1343_numOfSubarrays {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;    //滑动窗口中的和
        int left = 0;   //滑动窗口中左边界的下标
        int right = k - 1;    //右边界的下标
        int num = 0;        //符合条件的子数组数目
        for (int i = 0; i < k; i++) sum += arr[i];
        if (sum / k >= threshold) num++;
        while (right < arr.length - 1) {
            sum -= arr[left++];
            sum += arr[++right];
            if (sum/k >= threshold) num++;
        }
        return num;
    }

}
