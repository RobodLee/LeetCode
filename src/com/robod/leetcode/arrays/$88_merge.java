package com.robod.leetcode.arrays;

/**
 * @author Robod
 * @date 2020/8/3 18:16
 * 合并两个有序数组
 */
public class $88_merge {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m+n-1;
        int p1 = m-1;
        int p2=n-1;
        while (p1>=0 && p2>=0){
            if (nums1[p1]<nums2[p2]){
                nums1[p--]=nums2[p2--];
            } else {
                nums1[p--]=nums1[p1--];
            }
        }
        System.arraycopy(nums2,0,nums1,0,p2+1);
        System.out.println();
    }

    public static void main(String[] args) {
        new $88_merge().merge(new int[]{2,0},1,new int[]{1},1);
    }

}
