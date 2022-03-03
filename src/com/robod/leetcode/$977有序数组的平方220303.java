package com.robod.leetcode;

/**
 * @author Robod
 * @date 2022/3/3 11:48
 * @description 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class $977有序数组的平方220303 {

    /**
     * [-4,-2,0,3,10]
     * 以上面数组为例，首先遍历nums数组使得 negative(指向负数，向左移动) 指向最大的负数-2。positive（指针非负数，向右移动）初始指向negative右边一个元素。每次比较negative，positive指向元素的绝对值，将绝对值小的元素的平方放入result数组中；如果某一个指针到达边界则将另一个指针所指元素的平方放入result数组中。两个指针都到达边界后结束循环。
     */
    private int[] sortedSquares(int[] nums) {
        //nums 中最大负数的下标
        int negative = -1;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                negative = i;
            } else {
                break;
            }
        }
        //存放结果的数组
        int[] result = new int[len];
        int positive = negative + 1;
        int index = 0;
        while (negative >= 0 || positive < len) {
            if (negative < 0) {
                //左指针已经到最左边了
                result[index++] = nums[positive] * nums[positive];
                positive++;
            } else if (positive >= len) {
                //右指针已经到最右边了
                result[index++] = nums[negative] * nums[negative];
                negative--;
            } else if (-nums[negative] > nums[positive]) {
                result[index++] = nums[positive] * nums[positive];
                positive++;
            } else {
                result[index++] = nums[negative] * nums[negative];
                negative--;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
