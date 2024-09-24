package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $11盛最多水的容器240924
 * @Description 中等。https://leetcode.cn/problems/container-with-most-water/
 * @Author Robod
 * @Date 2024/9/24 下午8:55
 */
public class $11盛最多水的容器240924 {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left != right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}
