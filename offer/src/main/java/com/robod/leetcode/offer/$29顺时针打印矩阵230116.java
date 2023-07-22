package com.robod.leetcode.offer;

/**
 * @ClassName $29顺时针打印矩阵230116
 * @Description 简单。模拟过程：https://leetcode.cn/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/submissions/
 * @Author Robod
 * @Date 2023/1/16 10:51
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $29顺时针打印矩阵230116 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        // 四个边界
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        int length = matrix[0].length * matrix.length;
        int index = 0;
        int[] nums = new int[length];

        int i = 0;
        int j = 0;
        while (index < length) {
            // 右
            while (index < length && j <= right) {
                nums[index++] = matrix[i][j];
                j++;
            }
            i++;
            j--;
            top++;

            // 下
            while (index < length && i <= bottom) {
                nums[index++] = matrix[i][j];
                i++;
            }
            i--;
            j--;
            right--;

            // 左
            while (index < length && j >= left) {
                nums[index++] = matrix[i][j];
                j--;
            }
            i--;
            j++;
            bottom--;

            // 上
            while (index < length && i >= top) {
                nums[index++] = matrix[i][j];
                i--;
            }
            i++;
            j++;
            left++;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {
                        1, 2, 3
                }, {
                4, 5, 6
        }, {
                7, 8, 9
        }
        };
        new $29顺时针打印矩阵230116().spiralOrder(matrix);
    }
}
